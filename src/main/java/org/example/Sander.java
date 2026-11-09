package org.example;

public class Sander extends Tool {
    private int grit;

    public Sander(String name, int id, String usage, int grit) {
        super(name, id, usage);
        this.grit = grit;
    }

    public int getGrit() {
        return grit;
    }

    @Override
    public String toString() {
        return super.toString() + ", Зернистость: " + grit;
    }
}