package com.kurs.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class TourRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private String country;
    private LocalDate startDate;
    private Integer nights;
    private Integer persons;
    private Double minPrice;
    private Double maxPrice;
    private String food;

    public TourRequest() {}

    public TourRequest(String country, LocalDate startDate, Integer nights,
                       Integer persons, Double minPrice, Double maxPrice, String food) {
        this.country = country;
        this.startDate = startDate;
        this.nights = nights;
        this.persons = persons;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.food = food;
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

    public Integer getNights() {
        return nights;
    }

    public void setNights(Integer nights) {
        this.nights = nights;
    }

    public Integer getPersons() {
        return persons;
    }

    public void setPersons(Integer persons) {
        this.persons = persons;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
