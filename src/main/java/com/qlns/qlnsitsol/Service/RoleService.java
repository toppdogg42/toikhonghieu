package com.qlns.qlnsitsol.Service;

import com.qlns.qlnsitsol.entity.Role;
import com.qlns.qlnsitsol.enums.RoleName;

import java.util.Optional;

public interface RoleService {
    Optional<Role> getByRoleName(RoleName roleName);
    void save(Role role);
}
