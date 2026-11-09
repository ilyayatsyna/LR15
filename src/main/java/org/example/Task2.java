package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void run(Scanner sc) {
        File file = new File("f_task2.txt");

        System.out.println("Введите 10 целых чисел:");
        try (FileWriter writer = new FileWriter(file)) {
            for (int i = 0; i < 10; i++) {
                int val = sc.nextInt();
                writer.write(val + " ");
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
            return;
        }

        int count = 0;
        System.out.println("Числа из файла:");
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextInt()) {
                int num = fileScanner.nextInt();
                System.out.print(num + " ");
                if (num % 10 == 0 && num % 5 != 0) {
                    count++;
                }
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }

        System.out.println("Количество чисел кратных 10 и не кратных 5: " + count);
    }
}