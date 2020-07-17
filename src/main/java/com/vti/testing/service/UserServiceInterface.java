package com.vti.testing.service;

import java.util.List;

import com.vti.testing.entities.UserEntity;

public interface UserServiceInterface {

	public List<UserEntity> getAllUsers();

	public UserEntity getUserByID(short id);

	public UserEntity getUserByName(String name);

	public void createUser(UserEntity userEntity);

	public void updateUser(UserEntity userEntity);

	public void deleteUser(short id);

	public boolean isUserExistsByID(short id);

	public boolean isUserExistsByName(String name);
}
