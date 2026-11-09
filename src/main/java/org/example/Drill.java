package org.example;

public class Drill extends Tool {
    private int bits;

    public Drill(String name, int id, String usage, int bits) {
        super(name, id, usage);
        this.bits = bits;
    }

    public int getBits() {
        return bits;
    }

    @Override
    public String toString() {
        return super.toString() + ", Сверл в комплекте: " + bits;
    }
}