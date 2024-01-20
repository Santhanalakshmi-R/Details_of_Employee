package com.example.EmployeeDemo.Entity;
import jakarta.persistence.*;
@Entity
public class Employee {
@Id 
String emp_Id;
String name;
String gender;
int age;
int salary;
public Employee() {
	super();
}
public Employee(String emp_Id, String name, String gender, int age, int salary) {
	super();
	this.emp_Id = emp_Id;
	this.name = name;
	this.gender = gender;
	this.age = age;
	this.salary = salary;
}
public String getEmp_Id() {
	return emp_Id;
}
public void setEmp_Id(String emp_Id) {
	this.emp_Id = emp_Id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [emp_Id=" + emp_Id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", salary="
			+ salary + "]";
}

}
