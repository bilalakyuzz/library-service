package com.example.bookservice.service.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FindBookByIdResponse {
    private String title;
    private String author;
    private String isbn;
    private String publisher;
    private int pages;
    private String genre;
}
