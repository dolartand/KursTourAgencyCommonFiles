package com.kurs.dto.AdminDTOs;

import java.io.Serializable;

public class DeleteUserRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private int userId;

    public DeleteUserRequest() {}

    public DeleteUserRequest(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }
}
