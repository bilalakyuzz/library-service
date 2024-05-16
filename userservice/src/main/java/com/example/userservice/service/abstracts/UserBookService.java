package com.example.userservice.service.abstracts;

import com.example.userservice.entities.UserBook;
import com.example.userservice.service.dto.request.AddBookToUserRequest;
import com.example.userservice.service.dto.request.ReturnBookRequest;
import com.example.userservice.service.dto.response.FindBookByIdResponse;

import java.util.List;

public interface UserBookService {
    List<UserBook> getAllBooksByUserId(int userId);
    List<FindBookByIdResponse> findBooksByUserId(int userId);
    void addBookToUser(AddBookToUserRequest addBookToUserRequest);
    void returnBook(ReturnBookRequest returnBookRequest);
}
