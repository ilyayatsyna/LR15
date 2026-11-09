package org.example;

public class InvalidSchoolDataException extends RuntimeException {
    public InvalidSchoolDataException(String message) {
        super(message);
    }
}