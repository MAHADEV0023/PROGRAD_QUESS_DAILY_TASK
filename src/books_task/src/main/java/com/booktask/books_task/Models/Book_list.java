package com.booktask.books_task.Models;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="book")
public class Book_list {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int ISMB_NUMBER;

    @Column(nullable = false)
    private String BOOK_Name;
    @Column(nullable = false)
    private int BOOK_PRICE;
    @Column(nullable = false)
    private String AUTHOR_NAME;

}