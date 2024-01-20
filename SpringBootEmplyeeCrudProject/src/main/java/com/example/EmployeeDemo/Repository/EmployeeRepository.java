package com.example.EmployeeDemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmployeeDemo.Entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee,String>{

}
