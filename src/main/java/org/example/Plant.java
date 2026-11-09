package org.example;

public abstract class Plant {
    private String name;
    private double height;
    private String type;

    public Plant(String name, double height, String type) {
        this.name = name;
        this.height = height;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height >= 0) {
            this.height = height;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract void water();

    public abstract String getLightRequirements();

    public void displayInfo() {
        System.out.println("Название: " + name + ", высота: " + height + " м, тип: " + type);
    }
}