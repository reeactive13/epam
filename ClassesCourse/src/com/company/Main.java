package com.company;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        createBooks();
        searchByAuthor("Author4");
        searchByPublishingHouse("CBA");
        searchByYear(Year.of(1993));
    }

    private static void createBooks() {
        for (int i = 0; i <= 10; i++) {
            books.add(new Book());
        }
        int i = 1;
        for (Book book : books) {
            book.setId(i);
            book.setName(String.format("name%d", i));
            book.setAuthor(String.format("Author%d", i));
            book.setYear(Year.of(1990 + i));
            book.setPublishingHouse("CBA");
            book.setPages(10 * i);
            book.setPrice(300 + i);
            book.setCoverType("Soft");
            i++;
        }
    }

    private static void searchByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book.toString());
            }
        }
    }

    private static void searchByPublishingHouse(String house) {
        for (Book book : books) {
            if (book.getPublishingHouse().equals(house)) {
                System.out.println(book.toString());
            }
        }
    }

    private static void searchByYear(Year year) {
        for (Book book : books) {
            if (book.getYear().getValue() > year.getValue()) {
                System.out.println(book.toString());
            }
        }
    }
}
