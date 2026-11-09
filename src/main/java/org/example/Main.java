package org.example;

public class Main {
    public static void main(String[] args) {
        Plant[] plants = new Plant[5];

        plants[0] = new Tree("Дуб", 15.0, "Лиственное", 8.5);
        plants[1] = new Tree("Сосна", 20.0, "Хвойное", 5.0);
        plants[2] = new Tree("Береза", 12.0, "Лиственное", 4.2);
        plants[3] = new Flower("Роза", 0.8, "Кустарниковый цветок", "Красный");
        plants[4] = new Flower("Тюльпан", 0.4, "Луковичный цветок", "Желтый");

        System.out.println(" Список всех растений ");
        for (int i = 0; i < plants.length; i++) {
            System.out.println("\nРастение #" + (i + 1) + ":");
            plants[i].displayInfo();
            System.out.print("Режим полива: ");
            plants[i].water();
            System.out.println("Требования к свету: " + plants[i].getLightRequirements());
        }

        System.out.println("\n Проверка абстрактного класса");
        System.out.println("Попытка выполнить 'new Plant(...)' приведет к ошибке компиляции:");
        System.out.println("'Plant is abstract; cannot be instantiated'");
    }
}