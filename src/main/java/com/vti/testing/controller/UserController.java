package com.vti.testing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vti.testing.dto.UserDto;
import com.vti.testing.entities.UserEntity;
import com.vti.testing.service.UserServiceInterface;

@RestController
@RequestMapping(value = "api/v1/users")
public class UserController {

	@Autowired
	private UserServiceInterface service;

	@GetMapping()
	public ResponseEntity<?> getAllUsers() {
		List<UserEntity> entities = service.getAllUsers();
		return new ResponseEntity<List<UserEntity>>(entities, HttpStatus.OK);
	}

	@GetMapping(value = "/getUser/{id}")
	public ResponseEntity<?> getUserByID(@PathVariable(name = "id") short id) {

		return new ResponseEntity<UserEntity>(service.getUserByID(id), HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<?> createUser(@RequestBody UserDto userDTO) {

		service.createUser(userDTO.toEntity());

		return new ResponseEntity<String>("Create success !", HttpStatus.CREATED);

	}

	@PutMapping(value = "/updateUser/{id}")
	public ResponseEntity<?> updateUserById(@PathVariable(name = "id") short id, @RequestBody UserDto dto) {

		UserEntity userEntity = dto.toEntity();
		userEntity.setUserID(id);
		service.updateUser(userEntity);

		return new ResponseEntity<String>("Update success !", HttpStatus.OK);
	}

	@DeleteMapping(value = "/deleteUser/{id}")
	public ResponseEntity<?> deleteUserById(@PathVariable(name = "id") short id) {

		service.deleteUser(id);
		return new ResponseEntity<String>("Delete success !", HttpStatus.OK);
	}

}
