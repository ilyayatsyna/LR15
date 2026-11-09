package org.example;

public class Goalkeeper extends Athlete {
    private int cleanSheets;

    public Goalkeeper(String name, String team, int number, int cleanSheets) {
        super(name, team, number);
        this.cleanSheets = cleanSheets;
    }

    public int getCleanSheets() {
        return cleanSheets;
    }

    @Override
    public String getPosition() {
        return "Вратарь";
    }

    public void train(int hours, boolean withGloves) {
        String glovesText = withGloves ? "в перчатках" : "без перчаток";
        System.out.println(getName() + " отражает удары " + hours + " часов " + glovesText);
    }
}