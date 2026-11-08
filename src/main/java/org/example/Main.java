package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Илья");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n Меню ");
            System.out.println("1 - Задание 1 (Билет)");
            System.out.println("2 - Задание 2 (Горы)");
            System.out.println("3 - Задание 3 (Книги)");
            System.out.println("0 - Выход");
            System.out.print("Введите номер: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\n--- Задание 1 ---");
                    Ticket t = new Ticket("Кино", 15, 25.0);
                    System.out.print("До скидки: ");
                    t.show();

                    t.applyDiscount(10);
                    System.out.print("После скидки: ");
                    t.show();
                    break;

                case 2:
                    System.out.println("\n--- Задание 2 ---");
                    Mountain[] mountains = new Mountain[6];
                    mountains[0] = new Mountain("Эверест", 8848, "Непал");
                    mountains[1] = new Mountain("К2", 8611, "Пакистан");
                    mountains[2] = new Mountain("Канченджанга", 8586, "Индия");
                    mountains[3] = new Mountain("Эльбрус", 5642, "Россия");
                    mountains[4] = new Mountain("Монблан", 4810, "Франция");
                    mountains[5] = new Mountain("Казбек", 5033, "Грузия");

                    Mountain max = mountains[0];
                    double sum = 0;

                    for (int i = 0; i < mountains.length; i++) {
                        sum += mountains[i].height;
                        if (mountains[i].height > max.height) {
                            max = mountains[i];
                        }
                    }

                    double avg = sum / mountains.length;

                    System.out.println("Самая высокая гора: " + max.name + " (" + max.height + " м, " + max.country + ")");
                    System.out.println("Средняя высота: " + avg + " м");
                    break;

                case 3:
                    System.out.println("\n--- Задание 3 ---");
                    Book[] books = new Book[5];
                    books[0] = new Book("Мастер и Маргарита", Language.RUSSIAN);
                    books[1] = new Book("1984", Language.ENGLISH);
                    books[2] = new Book("Гарри Поттер", Language.ENGLISH);
                    books[3] = new Book("Фауст", Language.GERMAN);
                    books[4] = new Book("Маленький принц", Language.FRENCH);

                    System.out.println("Книги на английском языке:");
                    for (int i = 0; i < books.length; i++) {
                        if (books[i].language == Language.ENGLISH) {
                            System.out.println("- " + books[i].title);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Завершение работы.");
                    sc.close();
                    return;

                default:
                    System.out.println("Неверный ввод, попробуйте еще раз.");
                    break;
            }
        }
    }
}