package com.qlns.qlnsitsol.Service;

import com.qlns.qlnsitsol.entity.User;

import java.util.Optional;

public interface UserService {
    Optional<User> findByUserName(String s);
    Optional<User> findByEmail(String s);
    boolean existsByUserName(String s);
    boolean existsByEmail(String email);
}
