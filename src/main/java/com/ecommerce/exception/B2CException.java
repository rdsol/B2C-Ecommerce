package com.ecommerce.exception;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.io.*;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class B2CException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public B2CException(String message) {
        super(message);
    }
}
