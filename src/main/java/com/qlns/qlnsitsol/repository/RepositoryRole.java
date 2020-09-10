package com.qlns.qlnsitsol.repository;

import com.qlns.qlnsitsol.entity.Role;
import com.qlns.qlnsitsol.enums.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RepositoryRole extends JpaRepository<Role,Long> {
    Optional<Role> findByRoleName(RoleName roleName);
}
