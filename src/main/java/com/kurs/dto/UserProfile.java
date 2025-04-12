package com.kurs.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class UserProfile implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String lastName;
    private String surname;
    private String email;
    private String phone;
    private LocalDate birthDate;

    public UserProfile() {}

    public UserProfile(int id, String name, String lastName, String surname,
                       String email, String phone, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
