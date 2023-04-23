package com.hdfc.employeemanagementsystem.service;

import com.hdfc.employeemanagementsystem.dto.EmployeeDto;
import com.hdfc.employeemanagementsystem.entity.Employee;
import com.hdfc.employeemanagementsystem.exceptions.EmployeeNotFoundException;

import java.util.List;

public interface IEmployeeService {

    Employee getEmployeeById(int id) throws EmployeeNotFoundException;
    List<Employee> getAllEmployee();
    Employee addCustomer(EmployeeDto employeeDto);
}
