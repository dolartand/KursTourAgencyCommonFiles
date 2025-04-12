package com.kurs.dto;

import java.io.Serializable;

public class RegistrationRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String login;
    private String password;

    public RegistrationRequest(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
