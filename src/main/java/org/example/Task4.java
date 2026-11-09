package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task4 {
    public static void run(Scanner sc) {
        File file = new File("cpu_temp.txt");

        System.out.println("Введите 15 значений температуры процессора (например: 45,5 или 60.2):");
        try (FileWriter writer = new FileWriter(file)) {
            for (int i = 0; i < 15; i++) {
                double temp = sc.nextDouble();
                writer.write(temp + " ");
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
            return;
        }

        double sum = 0.0;
        int count = 0;

        try (Scanner fileScanner = new Scanner(file)) {
            fileScanner.useLocale(Locale.getDefault());
            while (fileScanner.hasNextDouble()) {
                sum += fileScanner.nextDouble();
                count++;
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
            return;
        }

        if (count > 0) {
            double avg = sum / count;
            System.out.printf("Считано значений: %d, Средняя температура: %.2f °C%n", count, avg);
        } else {
            System.out.println("Файл оказался пуст.");
        }
    }
}