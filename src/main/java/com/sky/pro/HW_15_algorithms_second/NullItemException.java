package com.sky.pro.HW_15_algorithms_second;

public class NullItemException extends RuntimeException{

    public NullItemException() {
    }


    public NullItemException(String message) {

        super(message);
    }


    public NullItemException(String message, Throwable cause) {

        super(message, cause);
    }


    public NullItemException(Throwable cause) {

        super(cause);
    }
}
