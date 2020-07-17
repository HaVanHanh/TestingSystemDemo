package com.vti.testing.dto;

import com.vti.testing.entities.Department;
import com.vti.testing.entities.Role;
import com.vti.testing.entities.UserEntity;

public class UserDto {

	private short userID;

	private String userName;

	private String email;

	private String password;

	private short roleID;

	private short departmentID;

	public UserEntity toEntity() {

		return new UserEntity(userID, userName, email, password, new Role(roleID), new Department(departmentID));
	}

	public short getUserID() {
		return userID;
	}

	public void setUserID(short userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public short getRoleID() {
		return roleID;
	}

	public void setRoleID(short roleID) {
		this.roleID = roleID;
	}

	public short getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(short departmentID) {
		this.departmentID = departmentID;
	}

}
