package org.example;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal("Лев", 5, 190.5);
        Animal a2 = new Animal("Тигр", 4, 220.0);
        Animal a3 = new Animal("Медведь", 7, 310.2);
        Animal a4 = new Animal("Волк", 3, 45.0);
        Animal a5 = new Animal("Зебра", 6, 300.3);

        System.out.println("Список животных:");
        System.out.println("1. " + a1.getSpecies() + ", возраст: " + a1.getAge() + " лет, вес: " + a1.getWeight() + " кг");
        System.out.println("2. " + a2.getSpecies() + ", возраст: " + a2.getAge() + " лет, вес: " + a2.getWeight() + " кг");
        System.out.println("3. " + a3.getSpecies() + ", возраст: " + a3.getAge() + " лет, вес: " + a3.getWeight() + " кг");
        System.out.println("4. " + a4.getSpecies() + ", возраст: " + a4.getAge() + " лет, вес: " + a4.getWeight() + " кг");
        System.out.println("5. " + a5.getSpecies() + ", возраст: " + a5.getAge() + " лет, вес: " + a5.getWeight() + " кг");

        System.out.println("\n--- Статистика зоопарка ---");
        System.out.println("Всего животных: " + Animal.getTotalAnimals());
        System.out.println("Общий вес: " + Animal.getTotalWeight() + " кг");
        System.out.printf("Средний вес: %.2f кг\n", Animal.getAverageWeight());
    }
}