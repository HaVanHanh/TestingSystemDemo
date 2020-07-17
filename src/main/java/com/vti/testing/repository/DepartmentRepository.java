package com.vti.testing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vti.testing.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Short> {

	public Department findByName(String name);

	public boolean existsByName(String name);
}
