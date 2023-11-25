package com.mycompany.lab;

public class FieldLengthLimitException extends Exception{
    public FieldLengthLimitException() {
    }
    public FieldLengthLimitException(String msg) {
        super(msg);
    }
}