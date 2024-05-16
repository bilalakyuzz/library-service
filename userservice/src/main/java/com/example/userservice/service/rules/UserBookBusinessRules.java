package com.example.userservice.service.rules;

import com.example.userservice.client.BookServiceClient;
import com.example.userservice.entities.UserBook;
import com.example.userservice.repository.UserRepository;
import com.example.userservice.service.abstracts.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserBookBusinessRules {
    private final UserRepository userRepository;
    private final BookServiceClient bookServiceClient;


    public void checkUserHasBook(List<UserBook> books,int newBookId) {
        for (UserBook userBook : books) {
            if(userBook.getBookId()==newBookId){
                throw new RuntimeException("This book already exists");
            }
        }

    }
    public void checkUserExistsAndBookAvailable(int userId,int bookId) {
        bookServiceClient.findById(bookId);
        userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
    }


    public void checkUserExistsAndBookBorrowed(int userId,List<UserBook> books,int returnBookId){
        userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        boolean bookExists = false;
        for (UserBook userBook : books) {
            if (userBook.getBookId() == returnBookId) {
                bookExists = true;
                break;
            }
        }
        if(!bookExists){
            throw new RuntimeException("User does not have this book");
        }


    }
}
