package com.kurs.dto;

import java.io.Serializable;

public class BookTourResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private boolean success;
    private String message;

    public BookTourResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}
