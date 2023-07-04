package com.driver.repositories;

import com.driver.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private final Map<Integer, User> users;

    public UserRepositoryImpl() {
        this.users = new HashMap<>();
    }

    @Override
    public Integer addUser(User user) {
        users.put(user.getAadharCardNo(), user);
        return null;
    }

    @Override
    public User getUser(int aadharCardNo) {
        return users.get(aadharCardNo);
    }
}

