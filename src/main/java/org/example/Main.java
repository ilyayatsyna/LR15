package org.example;

public class Main {
    public static void main(String[] args) {
        Pet[] pets = new Pet[5];

        pets[0] = new DogPet("Рекс", 4, "Илья", "Овчарка");
        pets[1] = new DogPet("Бобик", 2, "Иван", "Дворняга");
        pets[2] = new DogPet("Хатико", 6, "Алексей", "Акита-ину");
        pets[3] = new CatPet("Барсик", 3, "Ольга", "Рыжий");
        pets[4] = new CatPet("Мурка", 1, "Анна", "Белый");

        System.out.println(" Список всех питомцев ");
        for (int i = 0; i < pets.length; i++) {
            System.out.println("\nПитомeц #" + (i + 1) + ":");
            pets[i].displayInfo();
            pets[i].play();
        }
    }
}