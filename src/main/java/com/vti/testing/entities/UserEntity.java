package com.vti.testing.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "User", catalog = "TestingSystem")
public class UserEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "UserID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short userID;

	@Column(name = "UserName", length = 30, nullable = false)
	private String userName;

	@Column(name = "Email", length = 30, nullable = false)
	private String email;

	@Column(name = "Password", length = 30, nullable = false)
	private String password;

	@ManyToOne
	@JoinColumn(name = "RoleID")
	private Role roleID;

	@ManyToOne
	@JoinColumn(name = "DepartmentID")
	private Department department;

	public UserEntity() {
	}

	public UserEntity(short userID, String userName, String email, String password, Role roleID,
			Department departmentID) {
		this.userID = userID;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.roleID = roleID;
		this.department = departmentID;
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

	public Role getRoleID() {
		return roleID;
	}

	public void setRoleID(Role roleID) {
		this.roleID = roleID;
	}

	public Department getDepartmentID() {
		return department;
	}

	public void setDepartmentID(Department departmentID) {
		this.department = departmentID;
	}

}
