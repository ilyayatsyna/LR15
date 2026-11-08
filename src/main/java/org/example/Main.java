package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите задание варианта 26:");
        System.out.println("1 - Теорема Пифагора (гипотенуза)");
        System.out.println("2 - Проверка кратности 3 или 7");
        System.out.println("3 - Двоичное представление числа");
        System.out.print("Ваш выбор: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1: {
                System.out.print("Введите катет a: ");
                double a = scanner.nextDouble();
                System.out.print("Введите катет b: ");
                double b = scanner.nextDouble();

                if (a <= 0 || b <= 0) {
                    System.out.println("Катеты должны быть больше нуля.");
                } else {
                    double c = Math.sqrt(a * a + b * b);
                    System.out.printf("Гипотенуза c = %.4f%n", c);
                }
                break;
            }

            case 2: {
                System.out.print("Введите целое число: ");
                int number = scanner.nextInt();

                if (number % 3 == 0 || number % 7 == 0) {
                    System.out.println("Число " + number + " кратно 3 или 7.");
                } else {
                    System.out.println("Число " + number + " НЕ кратно ни 3, ни 7.");
                }
                break;
            }

            case 3: {
                System.out.print("Введите целое неотрицательное число: ");
                int n = scanner.nextInt();

                if (n < 0) {
                    System.out.println("Число должно быть неотрицательным.");
                } else if (n == 0) {
                    System.out.println("Двоичное представление: 0");
                } else {
                    String binaryResult = "";
                    int temp = n;
                    while (temp > 0) {
                        binaryResult = (temp % 2) + binaryResult;
                        temp = temp / 2;
                    }
                    System.out.println("Двоичное представление: " + binaryResult);
                }
                break;
            }

            default:
                System.out.println("Неверный номер задания.");
                break;
        }

        scanner.close();
    }
}