package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Статический полиморфизм (Перегрузка методов)");
        Athlete a = new Athlete("Илья", "Динамо", 10);
        a.train();
        a.train(2);
        a.train("пенальти");

        Forward f = new Forward("Криштиану", "Реал", 7, 850);
        f.train(3, 5);

        Goalkeeper g = new Goalkeeper("Нойер", "Бавария", 1, 300);
        g.train(2, true);

        System.out.println("\n 2. Динамический полиморфизм (Переопределение методов) ");
        Athlete[] squad = new Athlete[3];
        squad[0] = new Athlete("Максим", "Минск", 15);
        squad[1] = new Forward("Эрлинг", "Манчестер Сити", 9, 200);
        squad[2] = new Goalkeeper("Тибо", "Реал", 1, 150);

        for (int i = 0; i < squad.length; i++) {
            System.out.println("\nИгрок #" + (i + 1) + ":");
            squad[i].displayInfo();

            if (squad[i] instanceof Forward) {
                Forward forward = (Forward) squad[i];
                System.out.println("Забитых голов: " + forward.getGoals());
            } else if (squad[i] instanceof Goalkeeper) {
                Goalkeeper keeper = (Goalkeeper) squad[i];
                System.out.println("Сухих матчей: " + keeper.getCleanSheets());
            }
        }
    }
}