package it.unipr.aotlab.dmat.core.net;

import it.unipr.aotlab.dmat.core.workingnode.NodeMessageDigester;

import java.io.IOException;

public abstract class Message {
    int serialNo = 0;

    public enum MessageKind {
        IMMEDIATE(0x0),
        SUPPORT(0x1),
        ORDER(0x2);

        public int tag;
        private MessageKind(int tag) {
            this.tag = tag;
        }
    }

    public String contentType() {
        return this.getClass().getSimpleName();
    }

    public abstract MessageKind messageType();

    public abstract byte[] message();

    public void serialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public int serialNo() {
        return serialNo;
    }

    public abstract void accept(NodeMessageDigester digester)
            throws IOException;
}
