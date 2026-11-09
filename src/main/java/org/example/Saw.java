package org.example;

public class Saw extends Tool {
    private String blade;

    public Saw(String name, int id, String usage, String blade) {
        super(name, id, usage);
        this.blade = blade;
    }

    public String getBlade() {
        return blade;
    }

    @Override
    public String toString() {
        return super.toString() + ", Тип полотна: " + blade;
    }
}