package org.example;

public class Forward extends Athlete {
    private int goals;

    public Forward(String name, String team, int number, int goals) {
        super(name, team, number);
        this.goals = goals;
    }

    public int getGoals() {
        return goals;
    }

    @Override
    public String getPosition() {
        return "Нападающий";
    }

    public void train(int hours, int goals) {
        System.out.println(getName() + " тренирует удары " + hours + " часов и забивает " + goals + " голов");
    }
}