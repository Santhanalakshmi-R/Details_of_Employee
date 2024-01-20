package com.example.EmployeeDemo.Service;

import com.example.EmployeeDemo.Entity.Employee;

public interface EmployeeService {
public String create(Employee emp);
public Employee get(String emp_Id);
public String update(Employee emp);
public String delete(String emp_Id);
}
