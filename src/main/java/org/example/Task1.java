package org.example;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task1 {
    public static void run() {
        File file = new File("app_info.txt");

        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Название: Telegram\n");
            writer.write("Категория: Мессенджер\n");
            writer.write("Разработчик: Telegram FZ-LLC\n");
            writer.write("Особенности: Облачные чаты, боты, каналы, высокая скорость\n");
        } catch (IOException e) {
            System.out.println("Ошибка при записи файла: " + e.getMessage());
            return;
        }

        System.out.println("=== Данные о файле ===");
        System.out.println("Имя файла: " + file.getName());
        System.out.println("Абсолютный путь: " + file.getAbsolutePath());
        System.out.println("Размер: " + file.length() + " байт");
        System.out.println("Существует: " + (file.exists() ? "Да" : "Нет"));
        System.out.println("Доступ на чтение: " + (file.canRead() ? "Да" : "Нет"));
        System.out.println("Доступ на запись: " + (file.canWrite() ? "Да" : "Нет"));

        System.out.println("\n=== Содержимое файла ===");
        try (FileReader reader = new FileReader(file)) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}