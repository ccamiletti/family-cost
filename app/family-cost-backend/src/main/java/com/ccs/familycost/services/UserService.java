package com.ccs.familycost.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccs.familycost.model.UserEntity;
import com.ccs.familycost.repository.UserRepository;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public Optional<UserEntity> findByEmail(String email) {
		return this.userRepository.findByEmail(email);
	}

	public Optional<UserEntity> findByUserName(String userName) {
		return this.userRepository.findByUserName(userName);
	}
	
	public Optional<UserEntity> findById(Long id) {
		return this.userRepository.findById(id);
	}

	public List<UserEntity> findAll() {
		return this.userRepository.findAll();
	}

	public void deleteUser(UserEntity user) {
		this.userRepository.delete(user);
	}

	public UserEntity save(UserEntity user) {
		return this.userRepository.save(user);
	}

	
}
