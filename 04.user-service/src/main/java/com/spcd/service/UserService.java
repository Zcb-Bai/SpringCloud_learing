package com.spcd.service;

import com.spcd.pojo.User;

import java.util.List;


/**
 * @author zcb
 */
public interface UserService {
    void create(User user);

    User getUser(Long id);

    void update(User user);

    void delete(Long id);

    User getByUsername(String username);

    List<User> getUserByIds(List<Long> ids);
}
