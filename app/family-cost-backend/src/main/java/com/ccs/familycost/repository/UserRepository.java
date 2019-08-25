package com.ccs.familycost.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ccs.familycost.model.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>, UserRepositoryCustomer {
	
	@Query("SELECT u FROM UserEntity u LEFT JOIN FETCH u.roles WHERE u.userName=?1")
	Optional<UserEntity> findByUserName(String userName);

	Optional<UserEntity> findByEmail(String email);

}
