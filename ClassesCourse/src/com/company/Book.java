package com.company;

import java.time.Year;

public class Book {
    private int id;
    private String name;
    private String author;
    private Year year;
    private String publishingHouse;
    private int pages;
    private int price;
    private String coverType;

    public Book() {

    }

    public Book(int id, String name, String author, Year year, String publishingHouse, int pages, int price, String coverType) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.year = year;
        this.publishingHouse = publishingHouse;
        this.pages = pages;
        this.price = price;
        this.coverType = coverType;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, year: %s", this.name, this.year);
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        if (year.getValue() <= Year.now().getValue() && year.getValue() >= 868) {
            this.year = year;
        } else {
            System.out.println("Wrong year!");
        }
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }


}
