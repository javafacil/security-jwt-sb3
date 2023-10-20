package com.eduardo.securityandjwt.repo;

import com.eduardo.securityandjwt.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
}
