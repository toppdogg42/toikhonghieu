package com.qlns.qlnsitsol.serviceIplm;

import com.qlns.qlnsitsol.Service.RoleService;
import com.qlns.qlnsitsol.entity.Role;
import com.qlns.qlnsitsol.enums.RoleName;
import com.qlns.qlnsitsol.repository.RepositoryRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Roleiplm implements RoleService {
    @Autowired
    RepositoryRole repositoryRole;
    @Override
    public Optional<Role> getByRoleName(RoleName roleName) {
        return repositoryRole.findByRoleName(roleName) ;
    }

    @Override
    public void save(Role role) {
        repositoryRole.save(role);

    }
}
