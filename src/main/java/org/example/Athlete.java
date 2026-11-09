package org.example;

public class Athlete {
    private String name;
    private String team;
    private int number;

    public Athlete(String name, String team, int number) {
        this.name = name;
        this.team = team;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public int getNumber() {
        return number;
    }

    public void train() {
        System.out.println(name + " тренируется");
    }

    public void train(int hours) {
        System.out.println(name + " тренируется " + hours + " часов");
    }

    public void train(String exercise) {
        System.out.println(name + " тренирует " + exercise);
    }

    public String getPosition() {
        return "Неизвестная позиция";
    }

    public void displayInfo() {
        System.out.println("Спортсмен: " + name + ", Команда: " + team + ", Номер: " + number + ", Позиция: " + getPosition());
    }
}