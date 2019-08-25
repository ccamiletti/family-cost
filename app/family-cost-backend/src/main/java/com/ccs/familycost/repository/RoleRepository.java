package com.ccs.familycost.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ccs.familycost.model.Role;
import com.ccs.familycost.model.RoleName;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Optional<Role> findByName(RoleName roleName);
	
}
