package com.hdfc.employeemanagementsystem.service;

import com.hdfc.employeemanagementsystem.dto.EmployeeDto;
import com.hdfc.employeemanagementsystem.entity.Employee;
import com.hdfc.employeemanagementsystem.exceptions.EmployeeNotFoundException;
import com.hdfc.employeemanagementsystem.repository.IEmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImplementation implements IEmployeeService {

    Logger log = LoggerFactory.getLogger(this.getClass());
   @Autowired
    IEmployeeRepository employeeRepository;
    @Override
    public Employee getEmployeeById(int employeeId) throws EmployeeNotFoundException {
        return employeeRepository.findById(employeeId).orElseThrow(()->new EmployeeNotFoundException("Invalid Employee ID = "+employeeId));

    }

    @Override
    public List<Employee> getAllEmployee() {
        log.info("Got Sucessfully".repeat(50));
        return employeeRepository.findAll();
    }

    @Override
    public Employee addCustomer(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        employee.setEmployeeId(employeeDto.getEmployeeId());
        employee.setEmployeeName(employeeDto.getEmployeeName());
        employee.setEmployeeDateOfBirth(employeeDto.getEmployeeDateOfBirth());
        return employeeRepository.save(employee);
    }


}
