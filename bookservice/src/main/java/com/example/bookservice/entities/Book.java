package com.example.bookservice.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "books")
@Getter
@Setter
public class Book {
    @Id
    @Column(name ="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String author;
    private String isbn;
    private String publisher;
    private int pages;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Genre genre;

}
