package com.example.DepartmentService.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DepartmentService.Entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, String> {

	Optional<Department> findByDeptName(String depName);

}
