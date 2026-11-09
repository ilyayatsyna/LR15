package org.example;

import java.util.ArrayList;
import java.util.List;

public class Psychologist {
    private int id;
    private String name;
    private String specialization;
    private int rating;
    private List<Integer> clientRatings;

    public Psychologist(int id, String name, String specialization, int rating, List<Integer> clientRatings) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.rating = rating;
        this.clientRatings = new ArrayList<>(clientRatings);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public List<Integer> getClientRatings() {
        return clientRatings;
    }

    public double getAverageRating() {
        if (clientRatings == null || clientRatings.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (int r : clientRatings) {
            sum += r;
        }
        return sum / clientRatings.size();
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Имя: %-15s | Спец: %-18s | Уровень рейтинга: %d | Средний балл: %.2f",
                id, name, specialization, rating, getAverageRating());
    }
}