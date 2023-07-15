package com.mikel.price.calculator.exceptions;

public class BadRequest extends RuntimeException {
    public BadRequest() { super();}

    public BadRequest(String message) {
        super(message);
    }

    public BadRequest(String message, Throwable cause) {
        super(message, cause);
    }

    public BadRequest(Throwable cause) {
        super(cause);
    }
}
