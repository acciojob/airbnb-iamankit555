package com.driver.repositories;

import com.driver.model.User;

public interface UserRepository {
    Integer addUser(User user);
    User getUser(int aadharCardNo);
}