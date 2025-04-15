package com.kurs.dto.AdminDTOs;

import java.io.Serializable;

public class DeleteUserResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private boolean success;
    private String message;

    public DeleteUserResponse(boolean success, String message) {
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
