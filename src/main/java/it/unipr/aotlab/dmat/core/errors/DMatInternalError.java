package it.unipr.aotlab.dmat.core.errors;

public class DMatInternalError extends DMatUncheckedException {
    private static final long serialVersionUID = 694922327569211326L;

    public DMatInternalError() {
        super();
    }

    public DMatInternalError(String message) {
        super(message);
    }
}
