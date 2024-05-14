package com.example.userservice.service.concretes;


import com.example.userservice.client.BookServiceClient;
import com.example.userservice.entities.UserBook;
import com.example.userservice.repository.UserBookRepository;
import com.example.userservice.service.abstracts.UserBookService;
import com.example.userservice.service.dto.request.AddBookToUserRequest;
import com.example.userservice.service.dto.response.FindBookByIdResponse;
import com.example.userservice.service.mapper.UserBookMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserBookServiceImpl implements UserBookService {
    private final UserBookRepository userBookRepository;
    private final BookServiceClient bookServiceClient;


    @Override
    public List<UserBook> getAllBooksByUserId(int userId) {
        return userBookRepository.findByUserId(userId);
    }
    @Override
    public List<FindBookByIdResponse> findBooksByUserId(int userId) {
        List<UserBook> userBookList=userBookRepository.findByUserId(userId);
        Set<Integer> bookIds = userBookList.stream()
                .map(UserBook::getBookId)
                .collect(Collectors.toSet());

        return bookIds.stream()
                .map(bookServiceClient::findById)
                .collect(Collectors.toList());

    }

    @Override
    public void addBookToUser(AddBookToUserRequest addBookToUserRequest) {
        UserBook userBook= UserBookMapper.INSTANCE.getUserBookFromAddRequest(addBookToUserRequest);
        userBookRepository.save(userBook);
    }
}
