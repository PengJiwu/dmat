package it.unipr.aotlab.dmat.core.net.zeroMQ;

import it.unipr.aotlab.dmat.core.errors.NodeNotFound;
import it.unipr.aotlab.dmat.core.generated.EnvelopedMessageWire.EnvelopedMessageBody;
import it.unipr.aotlab.dmat.core.net.Address;
import it.unipr.aotlab.dmat.core.net.Message;
import it.unipr.aotlab.dmat.core.net.messages.MessageUtils;
import it.unipr.aotlab.dmat.core.registers.zeroMQ.NodeWorkGroup;

import java.io.IOException;
import java.util.Iterator;

import org.zeromq.ZMQ;

public class MessageSender implements
        it.unipr.aotlab.dmat.core.net.MessageSender {
    NodeWorkGroup nodeWorkGroup;
    ZMQ.Context zmqContext;

    public MessageSender(NodeWorkGroup nodeWorkGroup) {
        this.nodeWorkGroup = nodeWorkGroup;
        this.zmqContext = nodeWorkGroup.getSocketContext();
    }

    @Override
    public void sendMessage(Message m, String nodeName) throws IOException,
                                                               NodeNotFound {
        sendMessage(m, nodeWorkGroup.getNode(nodeName).getAddress());
    }

    public void sendMessage(Message m, Address ipAddress) {
        String address = ipAddress.getHost();
        int port = ipAddress.getPort();
        EnvelopedMessageBody envelopedMessage = MessageUtils.putInEnvelope(m);

        ZMQ.Socket socket = zmqContext.socket(ZMQ.REQ);
        try {
            socket.bind("tcp://" + address + ":" + port);
            socket.send(envelopedMessage.toByteArray(), 0);
        }
        finally {
            socket.close();
        }
    }

    @Override
    public void multicastMessage(Message m, Iterable<String> list)
            throws IOException, NodeNotFound {
        // XXX it will be replaced by true multicasting!
        Iterator<String> nodes = list.iterator();
        while (nodes.hasNext()) {
            String node = nodes.next();

            sendMessage(m, node);
        }
    }
}