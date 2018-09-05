package com.example.EmployeeService.Repository;

import com.example.EmployeeService.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
