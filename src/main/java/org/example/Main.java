package org.example;

public class Main {
    public static void main(String[] args) {
        Driveable[] cars = new Driveable[5];

        cars[0] = new Sedan("Toyota Camry", 90);
        cars[1] = new Sedan("BMW 3", 110);
        cars[2] = new Sedan("Audi A4", 100);
        cars[3] = new Suv("Toyota Land Cruiser", 80);
        cars[4] = new Suv("BMW X5", 120);

        System.out.println(" Проверка работы транспорта ");
        for (int i = 0; i < cars.length; i++) {
            System.out.println("\nМашина #" + (i + 1) + ":");
            cars[i].drive();
            System.out.println("Текущая скорость: " + cars[i].getSpeed() + " км/ч");

            if (cars[i] instanceof Parkable) {
                Parkable p = (Parkable) cars[i];
                p.park();
                System.out.println("Статус парковки: " + (p.isParked() ? "Припаркована" : "В движении"));
            }
        }
    }
}