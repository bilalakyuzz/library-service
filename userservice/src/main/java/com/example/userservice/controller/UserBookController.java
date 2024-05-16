package com.example.userservice.controller;

import com.example.userservice.entities.UserBook;
import com.example.userservice.service.abstracts.UserBookService;
import com.example.userservice.service.dto.request.AddBookToUserRequest;
import com.example.userservice.service.dto.request.ReturnBookRequest;
import com.example.userservice.service.dto.response.FindBookByIdResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/userbooks")
@RequiredArgsConstructor
public class UserBookController {
    private final UserBookService userBookService;


    @GetMapping("/getUserBooks/{userId}")
    public List<FindBookByIdResponse> getUserBooks(@PathVariable int userId) {
        return userBookService.findBooksByUserId(userId);
    }
    @PostMapping("/borrowBook")
    public void addBookToUser(@RequestBody AddBookToUserRequest addBookToUserRequest) {
        userBookService.addBookToUser(addBookToUserRequest);
    }

    @DeleteMapping("/returnBook")
    public void returnBook(@RequestBody ReturnBookRequest returnBookRequest) {
        userBookService.returnBook(returnBookRequest);
    }
}