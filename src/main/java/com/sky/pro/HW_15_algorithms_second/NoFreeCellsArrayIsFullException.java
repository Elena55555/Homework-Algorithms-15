package com.sky.pro.HW_15_algorithms_second;

public class NoFreeCellsArrayIsFullException extends RuntimeException{
    public NoFreeCellsArrayIsFullException() {
    }

    public NoFreeCellsArrayIsFullException(String message) {
        super(message);
    }

    public NoFreeCellsArrayIsFullException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoFreeCellsArrayIsFullException(Throwable cause) {
        super(cause);
    }
}
