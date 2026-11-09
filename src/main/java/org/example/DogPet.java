package org.example;

public class DogPet extends Pet {
    private String breed;

    public DogPet(String name, int age, String owner, String breed) {
        super(name, age, owner);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void play() {
        System.out.println(getName() + " играет с мячом");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Порода: " + breed);
    }

    public void bark() {
        System.out.println(getName() + " лает: Гав-гав!");
    }
}