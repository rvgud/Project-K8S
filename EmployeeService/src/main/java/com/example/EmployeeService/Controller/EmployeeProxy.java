package com.example.EmployeeService.Controller;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.EmployeeService.Entity.DepartmentDTO;
import com.example.EmployeeService.Entity.Employee;

@FeignClient(name="dep-service")
@RibbonClient(name="dep-service")
public interface EmployeeProxy {
	@GetMapping("/department/{depName}")
	  public Employee retrieveExchangeValue(@PathVariable("depName") String depName);
	@PostMapping("/department")
	  public Employee addDepartment(@RequestBody DepartmentDTO dpt);
}
