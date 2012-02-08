package it.unipr.aotlab.dmat.core.net.rabbitMQ.messages;

import it.unipr.aotlab.dmat.core.generated.MessageTestBody;
import it.unipr.aotlab.dmat.core.generated.MessageTestBody.Body;
import it.unipr.aotlab.dmat.core.net.Message;
import it.unipr.aotlab.dmat.core.workingnode.NodeMessageDigester;

public class MessageTest extends Message {
    public MessageTestBody.Body body;

    public MessageTest(Body body) {
        this.body = body;
    }
    
    @Override
    public void exec(NodeMessageDigester digester) {
        if (digester != null)
            digester.accept(this);
    }

    @Override
    public byte[] message() {
        return body.toByteArray();
    }
}