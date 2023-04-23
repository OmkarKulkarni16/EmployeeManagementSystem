package com.hdfc.employeemanagementsystem.restcontroller;

import com.hdfc.employeemanagementsystem.dto.EmployeeDto;
import com.hdfc.employeemanagementsystem.entity.Employee;
import com.hdfc.employeemanagementsystem.exceptions.EmployeeNotFoundException;
import com.hdfc.employeemanagementsystem.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    IEmployeeService employeeService;

    @GetMapping("/getEmployeeBy/{employeeId}")
    public ResponseEntity<EmployeeDto> getRatingByCustomerId(@PathVariable int employeeId) throws EmployeeNotFoundException {
        Employee employee = employeeService.getEmployeeById(employeeId);
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setEmployeeId(employee.getEmployeeId());
        employeeDto.setEmployeeName(employee.getEmployeeName());
        employeeDto.setEmployeeDateOfBirth(employee.getEmployeeDateOfBirth());
        return ResponseEntity.ok(employeeDto);

    }
    @GetMapping("/getAll")
    public List<Employee> getAll(){
        return employeeService.getAllEmployee();
    }


    @PostMapping("/addEmployee")
    public  ResponseEntity<String> addEmployee(@RequestBody EmployeeDto employeeDto){
           Employee employee = employeeService.addCustomer(employeeDto);
           return ResponseEntity.status(HttpStatus.CREATED).body("Employee Added Successfully");
    }
}
