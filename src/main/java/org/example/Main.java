package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Лабораторная работа №2");
        System.out.println("1 - Поиск элементов с повторением цифры первого элемента 2 раза");
        System.out.println("2 - Элементы двумерного массива, равные сумме своих индексов");
        System.out.print("Выберите номер задания (1 или 2): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                runTask1(scanner);
                break;
            case 2:
                runTask2();
                break;
            default:
                System.out.println("Ошибка: выбрано несуществующее задание.");
                break;
        }

        scanner.close();
    }

    private static void runTask1(Scanner scanner) {
        System.out.println("\nЗадание 1");

        int[] array = new int[5];
        System.out.println("Введите 5 элементов:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Исходный массив: " + Arrays.toString(array));

        int firstElement = array[0];
        int targetDigit = Math.abs(firstElement) % 10;
        System.out.println("Первый элемент: " + firstElement + ", его последняя цифра: " + targetDigit);

        System.out.print("Индексы элементов, содержащих цифру " + targetDigit + " ровно 2 раза: ");
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            int count = countDigitOccurrences(array[i], targetDigit);
            if (count == 2) {
                System.out.print(i + " (значение: " + array[i] + ") ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("таких элементов нет.");
        }
        System.out.println();
    }

    private static int countDigitOccurrences(int number, int digit) {
        int count = 0;
        long n = Math.abs((long) number);

        if (n == 0 && digit == 0) {
            return 1;
        }

        while (n > 0) {
            if (n % 10 == digit) {
                count++;
            }
            n /= 10;
        }

        return count;
    }

    private static void runTask2() {
        System.out.println("\nЗадание 2");

        int[][] matrix = {
                { 0,  1,  5,  7 },
                { 3,  2,  3, 11 },
                { 8,  9,  4,  5 }
        };

        System.out.println("Исходная матрица:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nЭлементы, совпадающие с суммой их индексов (a[i][j] == i + j):");
        boolean found = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == (i + j)) {
                    System.out.println("Элемент [" + i + "][" + j + "] = " + matrix[i][j] + " (сумма индексов: " + i + " + " + j + " = " + (i + j) + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Совпадений не найдено.");
        }
    }
}