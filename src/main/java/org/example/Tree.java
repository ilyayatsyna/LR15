package org.example;

public class Tree extends Plant {
    private double crownDiameter;

    public Tree(String name, double height, String type, double crownDiameter) {
        super(name, height, type);
        this.crownDiameter = crownDiameter;
    }

    public double getCrownDiameter() {
        return crownDiameter;
    }

    public void setCrownDiameter(double crownDiameter) {
        if (crownDiameter >= 0) {
            this.crownDiameter = crownDiameter;
        }
    }

    @Override
    public void water() {
        System.out.println("Поливается 1 раз в неделю");
    }

    @Override
    public String getLightRequirements() {
        return "Солнцелюбивое";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Диаметр кроны: " + crownDiameter + " м");
    }
}