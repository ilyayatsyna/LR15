package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void run() {
        File fileF = new File("f_task3.txt");
        File fileG = new File("g_task3.txt");
        File fileH = new File("h_task3.txt");

        Random rnd = new Random();
        try (FileWriter writer = new FileWriter(fileF)) {
            for (int i = 0; i < 15; i++) {
                int val = rnd.nextInt(200) - 50;
                writer.write(val + " ");
            }
        } catch (IOException e) {
            System.out.println("Ошибка генерации файла f: " + e.getMessage());
            return;
        }

        try (Scanner scanner = new Scanner(fileF);
             FileWriter writerG = new FileWriter(fileG);
             FileWriter writerH = new FileWriter(fileH)) {

            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num % 12 == 0 && num % 4 != 0) {
                    writerG.write(num + " ");
                } else {
                    writerH.write(num + " ");
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка разделения чисел: " + e.getMessage());
            return;
        }

        System.out.print("Исходный файл f: ");
        printFile(fileF);
        System.out.print("Файл g (кратные 12 и не кратные 4): ");
        printFile(fileG);
        System.out.print("Файл h (остальные): ");
        printFile(fileH);
    }

    private static void printFile(File f) {
        try (Scanner sc = new Scanner(f)) {
            if (!sc.hasNext()) {
                System.out.println("(пусто)");
                return;
            }
            while (sc.hasNext()) {
                System.out.print(sc.next() + " ");
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла " + f.getName());
        }
    }
}