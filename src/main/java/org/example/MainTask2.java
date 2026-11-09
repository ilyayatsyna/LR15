package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainTask2 {

    public static void printPsychologists(List<Psychologist> psychologists, int rating) {
        System.out.println("\n Психологи с рейтингом = " + rating + " ");
        boolean found = false;
        for (Psychologist p : psychologists) {
            if (p.getRating() == rating) {
                System.out.println(p);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Специалисты с таким рейтингом не найдены.");
        }
    }

    public static void main(String[] args) {
        List<Psychologist> list = new ArrayList<>();

        list.add(new Psychologist(1, "Смирнов А.В.", "Семейная терапия", 3, Arrays.asList(4, 5, 5, 4)));
        list.add(new Psychologist(2, "Кузнецова Е.М.", "Детская психология", 2, Arrays.asList(2, 3, 2, 3)));
        list.add(new Psychologist(3, "Васильев Д.С.", "Гештальт-терапия", 4, Arrays.asList(5, 5, 4, 5)));
        list.add(new Psychologist(4, "Попова А.Н.", "КПТ", 3, Arrays.asList(3, 3, 4, 3)));
        list.add(new Psychologist(5, "Новиков И.К.", "Кризисная помощь", 2, Arrays.asList(2, 2, 3, 1)));
        list.add(new Psychologist(6, "Морозова О.В.", "Психоанализ", 4, Arrays.asList(5, 5, 5, 5)));

        System.out.println(" Все психологи ");
        for (Psychologist p : list) {
            System.out.println(p);
        }

        System.out.println("\n 1. Психологи со средним рейтингом > 3 ");
        for (Psychologist p : list) {
            if (p.getAverageRating() > 3.0) {
                System.out.println(p);
            }
        }

        System.out.println("\n 2. Повышение рейтинга (при среднем балле >= 4) ");
        for (Psychologist p : list) {
            if (p.getAverageRating() >= 4.0) {
                p.setRating(p.getRating() + 1);
                System.out.println("Повышен рейтинг у " + p.getName() + " -> новый рейтинг: " + p.getRating());
            }
        }

        System.out.println("\n3. Проверка метода printPsychologists");
        printPsychologists(list, 5);
        printPsychologists(list, 3);

        System.out.println("\n4. Сортировка по убыванию среднего балла (и по имени)");
        list.sort(Comparator.comparingDouble(Psychologist::getAverageRating).reversed()
                .thenComparing(Psychologist::getName));

        for (Psychologist p : list) {
            System.out.printf("ID: %d | Имя: %-15s | Средний балл: %.2f%n",
                    p.getId(), p.getName(), p.getAverageRating());
        }
    }
}