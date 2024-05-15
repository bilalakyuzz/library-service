package com.example.bookservice.service.dto.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddBookRequest {
    private String title;
    private String author;
    private String isbn;
    private String publisher;
    private int pages;
    private int genreId;
}
