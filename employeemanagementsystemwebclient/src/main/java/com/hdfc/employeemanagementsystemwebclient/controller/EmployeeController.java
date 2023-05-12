package com.hdfc.employeemanagementsystemwebclient.controller;

import com.hdfc.employeemanagementsystemwebclient.dto.Employee;
import com.hdfc.employeemanagementsystemwebclient.dto.EmployeeDto;
import com.hdfc.employeemanagementsystemwebclient.exceptions.EmployeeNotFoundException;
import com.hdfc.employeemanagementsystemwebclient.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/employees")
public class EmployeeController {
    String baseUrl = "https://127.0.0.1:51406/employees";

    @Autowired
    IEmployeeService employeeService;
    @Autowired
    private RestTemplate restTemplate;

    private static final String PATTERN = "^-?+\\d+\\.?+\\d*$";
    @GetMapping("/getByEmployee/{id}")
    public EmployeeDto getEmployeeById(@PathVariable String id) throws EmployeeNotFoundException {
        EmployeeDto employeeDto = new EmployeeDto();
        int valueRetrieved = 0;
        if(id.matches(PATTERN)){
            valueRetrieved = Integer.parseInt(id);
            try {
                Employee response = restTemplate.getForObject(baseUrl+"/getEmployeeById/"+valueRetrieved, Employee.class);
                employeeDto.setEmployeeId(response.getEmployeeId());
                employeeDto.setEmployeeName(response.getEmployeeName());
                employeeDto.setEmployeeDateOfBirth(employeeService.decrypt(response.getEmployeeDateOfBirth()));
                return employeeDto;
            }catch (HttpStatusCodeException e){
                throw new EmployeeNotFoundException("Invalid Employee Id = "+id);
            }
        }else {
            throw new EmployeeNotFoundException("Please Enter Valid ID");
        }

    }
    

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }


    @GetMapping("/getAll")
    public List<Employee> getAll(){
       List<Employee> response = restTemplate.getForObject(baseUrl+"/getAll", List.class);
       return response;
    }
}
