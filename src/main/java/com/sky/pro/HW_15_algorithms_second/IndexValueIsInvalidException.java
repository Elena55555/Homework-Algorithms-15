package com.sky.pro.HW_15_algorithms_second;

public class IndexValueIsInvalidException extends RuntimeException {
    public IndexValueIsInvalidException() {
    }

    public IndexValueIsInvalidException(String message) {
        super(message);
    }

    public IndexValueIsInvalidException(String message, Throwable cause) {
        super(message, cause);
    }

    public IndexValueIsInvalidException(Throwable cause) {
        super(cause);
    }
}
