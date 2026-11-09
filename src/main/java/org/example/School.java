package org.example;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private String address;
    private int students;
    private int teachers;
    private double rating;
    private List<String> studentList;

    public School(String name, String address, int students, int teachers, double rating) {
        this.studentList = new ArrayList<>();
        setName(name);
        setAddress(address);
        setStudents(students);
        setTeachers(teachers);
        setRating(rating);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidSchoolDataException("Название школы не может быть пустым");
        }
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address == null || address.trim().isEmpty()) {
            throw new InvalidSchoolDataException("Адрес не может быть пустым");
        }
        this.address = address;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        if (students < 0) {
            throw new InvalidSchoolDataException("Количество учеников не может быть отрицательным: " + students);
        }
        this.students = students;
    }

    public int getTeachers() {
        return teachers;
    }

    public void setTeachers(int teachers) {
        if (teachers < 0) {
            throw new InvalidSchoolDataException("Количество учителей не может быть меньше 0: " + teachers);
        }
        this.teachers = teachers;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating < 0 || rating > 10) {
            throw new InvalidSchoolDataException("Рейтинг должен быть от 0 до 10: " + rating);
        }
        this.rating = rating;
    }

    public void enrollStudent(String studentName) throws EnrollmentException {
        if (studentName == null || studentName.trim().isEmpty()) {
            throw new EnrollmentException("Нельзя зачислить ученика с пустым именем");
        }
        if (studentList.contains(studentName)) {
            throw new EnrollmentException("Ученик " + studentName + " уже зачислен в школу");
        }

        studentList.add(studentName);
        students++;
        System.out.println("Ученик " + studentName + " успешно зачислен. Всего учеников: " + students);
    }

    public void expelStudent(String studentName) throws StudentNotFoundException {
        if (!studentList.contains(studentName)) {
            throw new StudentNotFoundException("Невозможно отчислить: ученик не найден в списках школы", studentName);
        }

        studentList.remove(studentName);
        students--;
        System.out.println("Ученик " + studentName + " отчислен. Осталось учеников: " + students);
    }

    public void showInfo() {
        System.out.println("Школа: " + name + " | Адрес: " + address + " | Учеников: " + students +
                " | Учителей: " + teachers + " | Рейтинг: " + rating);
    }
}