package com.xh.d1_exception;
//自定义异常
public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }

    public InvalidAgeException() {
    }
}
