package it.unipr.aotlab.dmat.core.net.rabbitMQ.messages;

import it.unipr.aotlab.dmat.core.net.Message;

import com.google.protobuf.InvalidProtocolBufferException;

public class MessagesClearReceivedMatrixPieces extends Messages {
    static {
        Messages.messageFactories.put(
                MessageClearReceivedMatrixPieces.class.getSimpleName(),
                new MessagesClearReceivedMatrixPieces());
    }

    private MessagesClearReceivedMatrixPieces() {
    }

    @Override
    public Message parseMessage(byte[] rawMessage)
            throws InvalidProtocolBufferException {
        return new MessageClearReceivedMatrixPieces();
    }
}
