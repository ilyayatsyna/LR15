package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Меню ---");
            System.out.println("1 - Символы в столбик");
            System.out.println("2 - Логин из email");
            System.out.println("3 - Отчет по зарплатам");
            System.out.println("4 - Регулярка (четные цифры)");
            System.out.println("0 - Выход");
            System.out.print("Выберите задание: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 0) {
                System.out.println("Завершение работы.");
                break;
            }

            switch (choice) {
                case 1:
                    task1(sc);
                    break;
                case 2:
                    task2(sc);
                    break;
                case 3:
                    task3();
                    break;
                case 4:
                    task4();
                    break;
                default:
                    System.out.println("Нет такого пункта!");
            }
        }

        sc.close();
    }

    public static void task1(Scanner sc) {
        System.out.print("Введите любую строку: ");
        String str = sc.nextLine();

        System.out.println("Результат:");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    public static void task2(Scanner sc) {
        System.out.print("Введите email: ");
        String email = sc.nextLine();

        int index = email.indexOf('@');
        if (index != -1) {
            String login = email.substring(0, index);
            System.out.println("Логин: " + login);
        } else {
            System.out.println("Это не email (нет символа @)");
        }
    }

    public static void task3() {
        Employee[] list = new Employee[4];
        list[0] = new Employee("Иванов И.И.", 1520.5);
        list[1] = new Employee("Петров П.П.", 890.0);
        list[2] = new Employee("Сидорова А.С.", 2450.75);
        list[3] = new Employee("Кузнецов Д.В.", 1100.2);

        Report.generateReport(list);
    }

    public static void task4() {
        String text = "a1a a12a a123a a1234a a12345a a123456a";
        System.out.println("Строка: " + text);

        Pattern p = Pattern.compile("a\\d{1,3}a");
        Matcher m = p.matcher(text);

        System.out.println("Найденные совпадения:");
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}

class Employee {
    String fullname;
    double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }
}

class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("----------------------------------------");
        System.out.printf("%-15s | %10s%n", "ФИО", "Оклад");
        System.out.println("----------------------------------------");

        for (int i = 0; i < employees.length; i++) {
            System.out.printf("%-15s | %10.2f%n", employees[i].fullname, employees[i].salary);
        }

        System.out.println("----------------------------------------");
    }
}