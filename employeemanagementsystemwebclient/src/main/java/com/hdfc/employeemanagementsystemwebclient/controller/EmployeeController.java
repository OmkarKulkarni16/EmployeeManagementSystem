package com.hdfc.employeemanagementsystemwebclient.controller;

import com.hdfc.employeemanagementsystemwebclient.dto.EmployeeDto;
import com.hdfc.employeemanagementsystemwebclient.entity.Employee;
import com.hdfc.employeemanagementsystemwebclient.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    String baseUrl = "https://localhost:8443/employees/";

    @Autowired
    IEmployeeService employeeService;
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/getByEmployee/{id}")
    public EmployeeDto getEmployeeById(@PathVariable int id){
        EmployeeDto employeeDto = new EmployeeDto();
        Employee response = restTemplate.getForObject(baseUrl+"getEmployeeBy/"+id, Employee.class);
        employeeDto.setEmployeeId(response.getEmployeeId());
        employeeDto.setEmployeeName(response.getEmployeeName());
        employeeDto.setEmployeeDateOfBirth(employeeService.decrypt(response.getEmployeeDateOfBirth()));
        return employeeDto;
    }
    

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
