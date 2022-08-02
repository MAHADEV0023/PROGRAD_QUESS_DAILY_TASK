package com.booktask.books_task.Models;
import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name="book")
public class Book_list {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int ISMB_NUMBER;

    public int getISMB_NUMBER() {
        return ISMB_NUMBER;
    }

    public void setISMB_NUMBER(int ISMB_NUMBER) {
        this.ISMB_NUMBER = ISMB_NUMBER;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public int getBook_price() {
        return book_price;
    }

    public void setBook_price(int book_price) {
        this.book_price = book_price;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    @Column
    private String book_name;
    @Column
    private int book_price;
    @Column
    private String author_name;

}