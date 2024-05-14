package com.example.userservice.service.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddBookToUserRequest {
    private int userId;
    private int bookId;

}
