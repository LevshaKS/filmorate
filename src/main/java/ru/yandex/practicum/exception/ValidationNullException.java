package ru.yandex.practicum.exception;

public class ValidationNullException extends NullPointerException {
    public ValidationNullException(String message) {
        super(message);
    }
}

