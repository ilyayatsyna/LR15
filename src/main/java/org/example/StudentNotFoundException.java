package org.example;

public class StudentNotFoundException extends Exception {
    private String studentName;

    public StudentNotFoundException(String message, String studentName) {
        super(message);
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }
}