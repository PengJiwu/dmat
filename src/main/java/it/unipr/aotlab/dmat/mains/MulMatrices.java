package it.unipr.aotlab.dmat.mains;

import it.unipr.aotlab.dmat.core.errors.ChunkNotFound;
import it.unipr.aotlab.dmat.core.errors.DMatError;
import it.unipr.aotlab.dmat.core.errors.IdNotUnique;
import it.unipr.aotlab.dmat.core.generated.TypeWire;
import it.unipr.aotlab.dmat.core.matrices.Matrices;
import it.unipr.aotlab.dmat.core.matrices.Matrix;
import it.unipr.aotlab.dmat.core.matrices.Multiplication;
import it.unipr.aotlab.dmat.core.net.Node;
import it.unipr.aotlab.dmat.core.net.rabbitMQ.Address;
import it.unipr.aotlab.dmat.core.net.rabbitMQ.Connector;
import it.unipr.aotlab.dmat.core.net.rabbitMQ.MessageSender;
import it.unipr.aotlab.dmat.core.net.rabbitMQ.Nodes;
import it.unipr.aotlab.dmat.core.registers.NodeRegister;

import java.io.IOException;

public class MulMatrices {
    public static void main(String[] argv) {
       try {
            MessageSender messageSender = new MessageSender(new Connector(
                    new Address("127.0.0.1")));
            NodeRegister register = new NodeRegister(messageSender);
            Nodes nodes = new Nodes(register);

            Node testNode = nodes.setNodeName("testNode").build();
            Node testNode2 = nodes.setNodeName("testNode2").build();

            Matrix A = Matrices.newBuilder()
                    .setName("A")
                    .setNofRows(10)
                    .setNofColumns(20)
                    .setElementType(TypeWire.ElementType.INT32).build();

            Matrix B = Matrices.newBuilder()
                    .setName("B")
                    .setNofRows(10)
                    .setNofColumns(15)
                    .splitVerticallyChuck(null, 10, "left", "right")
                    .splitHorizzontalyChuck("right", 4, "right-top", "right-bottom")
                    .setElementType(TypeWire.ElementType.INT32).build();

            Matrix C = Matrices.newBuilder()
                    .setName("C")
                    .setNofRows(15)
                    .setNofColumns(20)
                    .splitVerticallyChuck(null, 10, "left", "right")
                    .splitHorizzontalyChuck("left", 6, "left-top", "left-bottom")
                    .splitVerticallyChuck("left-bottom", 5, "left-bottom-left", "left-bottom-right")
                    .splitVerticallyChuck("right", 15, "right-left", "right-right")
                    .splitHorizzontalyChuck("right-right", 4, "right-right-top", "right-right-bottom")
                    .setElementType(TypeWire.ElementType.INT32).build();

            A.getChunk(null).assignChunkToNode(testNode);

            B.getChunk("left").assignChunkToNode(testNode2);
            B.getChunk("right-top").assignChunkToNode(testNode);
            B.getChunk("right-bottom").assignChunkToNode(testNode2);
            
            C.getChunk("left-top").assignChunkToNode(testNode);
            C.getChunk("left-bottom-left").assignChunkToNode(testNode2);
            C.getChunk("left-bottom-right").assignChunkToNode(testNode);
            C.getChunk("right-left").assignChunkToNode(testNode2);
            C.getChunk("right-right-top").assignChunkToNode(testNode);
            C.getChunk("right-right-bottom").assignChunkToNode(testNode2);

            Multiplication r = new Multiplication();

            r.setOperands(A, B, C);
            r.exec();

            MessageSender.closeConnection();
        } catch (ChunkNotFound e) {
            e.printStackTrace();
        } catch (IdNotUnique e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DMatError e) {
            e.printStackTrace();
        }
    }
}