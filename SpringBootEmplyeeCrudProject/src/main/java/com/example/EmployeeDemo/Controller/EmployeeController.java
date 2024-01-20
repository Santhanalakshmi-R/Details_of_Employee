package com.example.EmployeeDemo.Controller;

import org.springframework.web.bind.annotation.*;

import com.example.EmployeeDemo.Entity.Employee;
import com.example.EmployeeDemo.Service.EmployeeService;

@RestController
@RequestMapping("Employee")
public class EmployeeController {
EmployeeService emser;

public EmployeeController(EmployeeService emser) {
	super();
	this.emser = emser;
}
@PostMapping
public String create(@RequestBody Employee emp) {
	String msg=emser.create(emp);
	return msg;
}

@GetMapping(value="{emp_Id}")
public Employee get(@PathVariable String emp_Id) {
	Employee emp=emser.get(emp_Id);
	return emp;
}

@PutMapping
public String update(@RequestBody Employee emp) {
	String msg=emser.update(emp);
	return msg;
}

@DeleteMapping(value="{emp_Id}")
public String delete(@PathVariable String emp_Id) {
	String msg=emser.delete(emp_Id);
	return msg;
}
}
