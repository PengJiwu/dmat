package it.unipr.aotlab.dmat.core.net.rabbitMQ.messages;

import it.unipr.aotlab.dmat.core.generated.ChunkDescriptionWire;
import it.unipr.aotlab.dmat.core.matrices.Chunk;
import it.unipr.aotlab.dmat.core.net.MessageOrder;
import it.unipr.aotlab.dmat.core.workingnode.NodeMessageDigester;

public class MessageAssignChunkToNode extends MessageOrder {
    public ChunkDescriptionWire.ChunkDescriptionBody body;

    public MessageAssignChunkToNode(ChunkDescriptionWire
            .ChunkDescriptionBody body) {
        this.body = body;
    }

    public MessageAssignChunkToNode(Chunk chunk) {
        this.body = chunk.buildMessageBody();
    }

    @Override
    public byte[] message() {
        return body.toByteArray();
    }

    @Override
    public void accept(NodeMessageDigester digester) {
        digester.accept(this);
    }
}
