package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //fake user list

    List<User> list = List.of(
            new User(101L, "Durgesh Tiwari", "23525625"),
            new User(102L, "Ankit Tiwari", "99999"),
            new User(103L, "Ravi Tiwari", "888")
    );

    @Override
    public User getUser(Long id) {
        return list.stream()
        		.filter(user -> 
        		user.getUserId()
        		.equals(id))
        		.findAny().orElse(null);
    }
}
