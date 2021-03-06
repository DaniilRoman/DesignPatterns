package BridgePattern.Vector.VectorImpl;

import BridgePattern.Vector.IVector;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class VectorN implements IVector {

    private Integer[] values;
    private int length;

    public VectorN(int length) {
        values = new Integer[length];
        this.length = length;
    }

    @Override
    public Integer getSize() {
        return length;
    }

    @Override
    public Integer get(int pos) {
        return values[pos];
    }

    @Override
    public void set(int pos, Integer value) {
        values[pos] = value;
    }
}
