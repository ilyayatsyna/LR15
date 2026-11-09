package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n Лабораторная работа №14 Вариант 26");
            System.out.println("1. Задание 1 (Информация о приложении)");
            System.out.println("2. Задание 2 (10 чисел, кратные 10 и не кратные 5)");
            System.out.println("3. Задание 3 (Случайные числа, разделение в файлы g и h)");
            System.out.println("4. Задание 4 (15 значений температуры процессора)");
            System.out.println("5. Задание 5 (10 чисел, количество больших 80)");
            System.out.println("0. Выход");
            System.out.print("Выберите задание: ");

            int choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("Работа завершена.");
                break;
            }

            switch (choice) {
                case 1:
                    Task1.run();
                    break;
                case 2:
                    Task2.run(sc);
                    break;
                case 3:
                    Task3.run();
                    break;
                case 4:
                    Task4.run(sc);
                    break;
                case 5:
                    Task5.run();
                    break;
                default:
                    System.out.println("Неверный номер задания.");
                    break;
            }
        }

        sc.close();
    }
}