package com.vti.testing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vti.testing.entities.UserEntity;
import com.vti.testing.repository.UserRepository;

@Service
public class UserServiceImpl implements UserServiceInterface {

	@Autowired
	private UserRepository repository;

	@Override
	public List<UserEntity> getAllUsers() {

		return repository.findAll();
	}

	@Override
	public UserEntity getUserByID(short id) {
		return repository.findById(id).get();
	}

	@Override
	public UserEntity getUserByName(String name) {

		return repository.findByUserName(name);
	}

	@Override
	public void createUser(UserEntity userEntity) {
		repository.save(userEntity);
	}

	@Override
	public void updateUser(UserEntity userEntity) {
		repository.save(userEntity);
	}

	@Override
	public void deleteUser(short id) {
		repository.delete(repository.findById(id).get());
	}

	@Override
	public boolean isUserExistsByID(short id) {
		return repository.existsById(id);
	}

	@Override
	public boolean isUserExistsByName(String name) {

		return repository.existsByUserName(name);
	}

}
