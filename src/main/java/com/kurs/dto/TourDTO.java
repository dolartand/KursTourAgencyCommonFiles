package com.kurs.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class TourDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String title;
    private String description;
    private String country;
    private LocalDate startDate;
    private int nights;
    private double price;
    private String food;
    private int capacity;

    public TourDTO() {}

    public TourDTO(int id, String title, String description, String country,
                   LocalDate startDate, int nights, double price, int capacity) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.country = country;
        this.startDate = startDate;
        this.nights = nights;
        this.price = price;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
