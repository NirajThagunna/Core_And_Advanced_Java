package com.nirajThagunna;

public class Class2 extends Class1 {
    public int x;
    protected int y;
    private int z;

    public Class2(int a, int b, int x, int y) {
        super(a, b);
        this.x = x;
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getZ() {
        return this.z;
    }
}
