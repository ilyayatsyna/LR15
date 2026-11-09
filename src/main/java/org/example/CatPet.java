package org.example;

public class CatPet extends Pet {
    private String color;

    public CatPet(String name, int age, String owner, String color) {
        super(name, age, owner);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void play() {
        System.out.println(getName() + " играет с клубком");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Цвет: " + color);
    }

    public void meow() {
        System.out.println(getName() + " мяукает: Мяу-мяу!");
    }
}