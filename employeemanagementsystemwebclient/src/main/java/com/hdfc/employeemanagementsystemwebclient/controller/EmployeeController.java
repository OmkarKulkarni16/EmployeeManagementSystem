package com.hdfc.employeemanagementsystemwebclient.controller;

import com.hdfc.employeemanagementsystemwebclient.entity.Employee;
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
    private RestTemplate restTemplate;
    @GetMapping("/getByEmployee/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        Employee response = restTemplate.getForObject(baseUrl+"getEmployeeBy/"+id, Employee.class);
        return response;
    }
    
//     This is for testing purpose
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
