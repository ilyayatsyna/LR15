package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void run() {
        File file = new File("f_task5.txt");
        Random rnd = new Random();

        try (FileWriter writer = new FileWriter(file)) {
            for (int i = 0; i < 10; i++) {
                int val = rnd.nextInt(120) + 1;
                writer.write(val + " ");
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
            return;
        }

        int count = 0;
        System.out.print("Сгенерированные числа в файле: ");
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextInt()) {
                int num = fileScanner.nextInt();
                System.out.print(num + " ");
                if (num > 80) {
                    count++;
                }
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }

        System.out.println("Количество чисел больших 80: " + count);
    }
}