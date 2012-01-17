package it.unipr.aotlab.dmat.core.net.rabbitMQ;

import it.unipr.aotlab.dmat.core.errors.DMatInternalError;
import it.unipr.aotlab.dmat.core.net.Message;
import it.unipr.aotlab.dmat.core.util.ForceLoad;

import java.util.HashMap;
import java.util.Map;

import com.google.protobuf.InvalidProtocolBufferException;
import com.rabbitmq.client.QueueingConsumer;

public class Messages {
    static Map<String, Messages> messageFactories = new HashMap<String, Messages>();

    static {
        ForceLoad.listFromFile(Messages.class, "KindOfMessages");
    }

    public Message parseMessage(byte[] rawMessage)
            throws InvalidProtocolBufferException {
        throw new DMatInternalError(
                "Invalid call to parseMessage! Unknown message type?");
    }

    public static Messages getFactory(String contentType) {
        Messages m = messageFactories.get(contentType);
        if (m == null)
            throw new DMatInternalError("Unknown content type:" + contentType);

        return m;
    }

    public static Message readMessage(QueueingConsumer.Delivery envelopedMessage)
            throws InvalidProtocolBufferException {
        return readMessage(envelopedMessage.getProperties().getContentType(),
                envelopedMessage.getBody());
    }

    public static Message readMessage(String contentType, byte[] rawMessage)
            throws InvalidProtocolBufferException {
        return getFactory(contentType).parseMessage(rawMessage);
    }
}