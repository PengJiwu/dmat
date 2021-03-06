package it.unipr.aotlab.dmat.core.matrixPiece;

public class Int32Triplet implements Triplet {
    public int row;
    public int col;
    public int value;

    public Int32Triplet(int row, int col, int value) {
        this.row = row;
        this.col = col;
        this.value = value;
    }

    @Override
    public int row() {
        return row;
    }

    @Override
    public int col() {
        return col;
    }

    @Override
    public Integer value() {
        return value;
    }

    @Override
    public void setValue(Object newValue) {
        Integer tNewValue = (Integer)newValue;

        value = tNewValue;
    }

    @Override
    public Triplet getCopy() {
        return new Int32Triplet(row, col, value);
    }

    @Override
    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public void setCol(int col) {
        this.col = col;
    }
}
