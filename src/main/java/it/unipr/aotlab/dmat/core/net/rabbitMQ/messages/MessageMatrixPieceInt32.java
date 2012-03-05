package it.unipr.aotlab.dmat.core.net.rabbitMQ.messages;

import it.unipr.aotlab.dmat.core.generated.MatrixPieceTripletsInt32Wire;
import it.unipr.aotlab.dmat.core.generated.support.MatrixPieceTripletsInt32WireSupport;
import it.unipr.aotlab.dmat.core.matrices.Rectangle;
import it.unipr.aotlab.dmat.core.matrixPiece.Int32Triplet;
import it.unipr.aotlab.dmat.core.matrixPiece.MatrixPieceTripletsInt32;
import it.unipr.aotlab.dmat.core.matrixPiece.MatrixPieces;
import it.unipr.aotlab.dmat.core.matrixPiece.Triplet;
import it.unipr.aotlab.dmat.core.matrixPiece.MatrixPieceTripletsInt32.Builder;
import it.unipr.aotlab.dmat.core.workingnode.InNodeChunk;
import it.unipr.aotlab.dmat.core.workingnode.NodeMessageDigester;

import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MessageMatrixPieceInt32 extends MessageMatrixValues {
    public MatrixPieceTripletsInt32Wire.MatrixPieceTripletsInt32Body body;

    public MessageMatrixPieceInt32(MatrixPieceTripletsInt32Wire.MatrixPieceTripletsInt32Body body) {
        this.body = body;
    }

    @Override
    public byte[] message() {
        return body.toByteArray();
    }

    @Override
    public void accept(NodeMessageDigester digester) throws IOException {
        digester.accept(this);
    }

    @Override
    public String getMatrixId() {
        return MatrixPieceTripletsInt32WireSupport.getMatrixId(body);
    }

    @Override
    public void dispatch(InNodeChunk<?> node) {
        node.accept(this);
    }

    @Override
    public Rectangle getArea() {
        return Rectangle.build(body.getPosition());
    }

    @Override
    public int getColRep() {
        return body.getPosition().getStartCol();
    }

    @Override
    public int getRowRep() {
        return body.getPosition().getStartRow();
    }

    @Override
    public boolean getUpdate() {
        return body.getUpdate();
    }

    @Override
    public String getChunkId() {
        return body.getChunkId();
    }

    
    private class MessageMatrixIterator implements Iterator<Triplet> {
        int end;
        int current;

        public MessageMatrixIterator() {
            this.current = 0;
            this.end = body.getValuesCount();
        }

        @Override
        public boolean hasNext() {
            return current < end;
        }

        @Override
        public Int32Triplet next() {
            if (hasNext()) {
                MatrixPieceTripletsInt32Wire.Triplet t = body.getValues(current);
                ++current;

                return new Int32Triplet(t.getRow(), t.getCol(), t.getValue());
            } else
                throw new NoSuchElementException();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public Iterator<Triplet> matrixPieceIterator() {
        return new MessageMatrixIterator();
    }

    @Override
    public String getNodeId() {
        return body.getNodeId();
    }

    @Override
    public MatrixPieces.Builder getAppropriatedBuilder() {
        return new MatrixPieceTripletsInt32.Builder();
    }
}
