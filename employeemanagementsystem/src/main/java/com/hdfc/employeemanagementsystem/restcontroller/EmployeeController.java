package com.hdfc.employeemanagementsystem.restcontroller;

import com.hdfc.employeemanagementsystem.dto.EmployeeDto;
import com.hdfc.employeemanagementsystem.entity.Employee;
import com.hdfc.employeemanagementsystem.exceptions.EmployeeNotFoundException;
import com.hdfc.employeemanagementsystem.service.IEmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    IEmployeeService employeeService;

    @GetMapping("/getEmployeeBy/{employeeId}")
    public ResponseEntity<EmployeeDto> getRatingByCustomerId(@PathVariable int employeeId) throws EmployeeNotFoundException {
        Employee employee = employeeService.getEmployeeById(employeeId);
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setEmployeeId(employee.getEmployeeId());
        employeeDto.setEmployeeName(employee.getEmployeeName());
        employeeDto.setEmployeeDateOfBirth(employeeService.encrypt(employee.getEmployeeDateOfBirth()));
        return ResponseEntity.ok(employeeDto);

    }
    @GetMapping("/getAll")
    public List<Employee> getAll(){
        return employeeService.getAllEmployee();
    }


//    @PostMapping("/addEmployee")
//    public  ResponseEntity<String> addEmployee(@RequestBody EmployeeDto employeeDto){
//           Employee employee = employeeService.addCustomer(employeeDto);
//           return ResponseEntity.status(HttpStatus.CREATED).body("Employee Added Successfully");
//    }
}
