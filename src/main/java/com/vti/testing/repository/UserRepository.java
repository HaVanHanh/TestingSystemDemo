package com.vti.testing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vti.testing.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Short> {

	public UserEntity findByUserName(String userName);

	public boolean existsByUserName(String userName);
}
