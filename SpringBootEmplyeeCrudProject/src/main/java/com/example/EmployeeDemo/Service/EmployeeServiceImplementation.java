package com.example.EmployeeDemo.Service;

import org.springframework.stereotype.Service;

import com.example.EmployeeDemo.Entity.Employee;
import com.example.EmployeeDemo.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService{
EmployeeRepository emrep;

public EmployeeServiceImplementation(EmployeeRepository emrep) {
	super();
	this.emrep = emrep;
}

@Override
public String create(Employee emp) {
	emrep.save(emp);
	return "Employe details are  stored";
}

@Override
public Employee get(String emp_Id) {
	Employee emp=emrep.findById(emp_Id).get();
	return emp;
}

@Override
public String update(Employee emp) {
	emrep.save(emp);
	return "Employee details are updated";
}

@Override
public String delete(String emp_Id) {
	emrep.deleteById(emp_Id);
	return "Employee details are deleted";
}

}
