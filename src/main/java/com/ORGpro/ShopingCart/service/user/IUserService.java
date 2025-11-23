package com.ORGpro.ShopingCart.service.user;

import com.ORGpro.ShopingCart.Dto.UserDto;
import com.ORGpro.ShopingCart.model.User;
import com.ORGpro.ShopingCart.request.CreateUserRequest;
import com.ORGpro.ShopingCart.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);
    User getAuthenticatedUser();
    UserDto convertUserToDto(User user);
}