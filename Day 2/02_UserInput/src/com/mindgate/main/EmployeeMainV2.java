package com.mindgate.main;

import com.mindgate.pojo.Employee;

public class EmployeeMainV2 {
public static void main(String[] args) {
	Employee employee = new Employee(101, "Shubham", 10000);
	System.out.println(employee.toString());
}
}
