package org.example;

public class Animal {
    private String species;
    private int age;
    private double weight;

    private static int totalAnimals = 0;
    private static double totalWeight = 0;

    public Animal(String species, int age, double weight) {
        this.species = species;
        this.age = age;
        this.weight = weight;

        totalAnimals++;
        totalWeight += weight;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public static int getTotalAnimals() {
        return totalAnimals;
    }

    public static double getTotalWeight() {
        return totalWeight;
    }

    public static double getAverageWeight() {
        if (totalAnimals == 0) {
            return 0;
        }
        return totalWeight / totalAnimals;
    }
}