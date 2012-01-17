package it.unipr.aotlab.dmat.core.net.rabbitMQ;

import it.unipr.aotlab.dmat.core.generated.MessageTestBody;
import it.unipr.aotlab.dmat.core.net.Message;

import com.google.protobuf.InvalidProtocolBufferException;

public class MessagesAssignChunkToNode extends Messages {
    static {
        Messages.messageFactories.put(MessageAssignChunkToNode.class.getSimpleName(),
                new MessagesAssignChunkToNode());
    }

    private MessagesAssignChunkToNode() {
    }
    
    @Override
    public Message parseMessage(byte[] rawMessage) throws InvalidProtocolBufferException {
        return new MessageTest(MessageTestBody.Body.parseFrom(rawMessage));
    }
}