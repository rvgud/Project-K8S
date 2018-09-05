package com.example.DepartmentService.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.DepartmentService.Entity.Department;
import com.example.DepartmentService.Entity.DepartmentDTO;
import com.example.DepartmentService.Repository.DepartmentRepository;

@RestController
public class DepartmentController {
	 @Autowired
	  private DepartmentRepository repository;
	 
	 @GetMapping("/department/{depName}")
	 public Optional<Department>  getDepartment(@PathVariable  String depName){
		 return repository.findByDeptName(depName);
	 }
	 @PostMapping("/department")
	 public void  postDepartment(@RequestBody DepartmentDTO dept){
		 Department dep =new Department();
		 dep.setDeptName(dept.getDeptName());
		 repository.save(dep);
	 }	
}
