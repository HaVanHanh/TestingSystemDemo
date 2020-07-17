package com.vti.testing.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Role", catalog = "TestingSystem")
public class Role {

	@Column(name = "RoleID")
	@Id
	private short idRole;

	@Column(name = "NameRole", length = 30, nullable = false)
	private String nameRole;

	public Role() {

	}

	public Role(short idRole) {
		this.idRole = idRole;
	}

	public Role(short idRole, String nameRole) {
		this.idRole = idRole;
		this.nameRole = nameRole;
	}

	public String getNameRole() {
		return nameRole;
	}

	public void setNameRole(String nameRole) {
		this.nameRole = nameRole;
	}

	public short getIdRole() {
		return idRole;
	}

	public void setIdRole(short idRole) {
		this.idRole = idRole;
	}

}
