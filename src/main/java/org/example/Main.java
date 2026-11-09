package org.example;

public class Main {
    public static void main(String[] args) {
        School school = new School("Гимназия №1", "ул. Ленина, 10", 0, 45, 9.4);
        school.showInfo();

        try {
            school.setStudents(-15);
        } catch (InvalidSchoolDataException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }

        try {
            school.enrollStudent("Иван Иванов");
            school.enrollStudent("Анна Смирнова");
            school.enrollStudent("Иван Иванов");
        } catch (EnrollmentException e) {
            System.out.println("Ошибка зачисления: " + e.getMessage());
        }

        try {
            school.expelStudent("Анна Смирнова");
            school.expelStudent("Петр Сидоров");
        } catch (StudentNotFoundException e) {
            System.out.println("Ошибка поиска: " + e.getMessage() + " (Имя: " + e.getStudentName() + ")");
        } finally {
            System.out.println("Операция отчисления завершена.");
        }

        // Итоговый вывод информации
        school.showInfo();
    }
}