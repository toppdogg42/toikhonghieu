package com.qlns.qlnsitsol.serviceIplm;

import com.qlns.qlnsitsol.Service.UserService;
import com.qlns.qlnsitsol.entity.User;
import com.qlns.qlnsitsol.repository.RepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserIplm implements UserService {
    @Autowired
    RepositoryUser repositoryUser;
    @Override
    public Optional<User> findByUserName(String s) {
        return repositoryUser.findByUserName(s);
    }

    @Override
    public Optional<User> findByEmail(String s) {
        return repositoryUser.findByEmail(s);
    }

    @Override
    public boolean existsByUserName(String s) {
        return repositoryUser.existsByUserName(s);
    }

    @Override
    public boolean existsByEmail(String email) {
        return repositoryUser.existsByEmail(email);
    }
}
