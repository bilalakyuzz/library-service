package com.example.userservice.service.mapper;

import com.example.userservice.entities.User;
import com.example.userservice.entities.UserBook;
import com.example.userservice.service.dto.request.AddBookToUserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserBookMapper {
    UserBookMapper INSTANCE= Mappers.getMapper(UserBookMapper.class);

    UserBook getUserBookFromAddRequest(AddBookToUserRequest addBookToUserRequest);
}
