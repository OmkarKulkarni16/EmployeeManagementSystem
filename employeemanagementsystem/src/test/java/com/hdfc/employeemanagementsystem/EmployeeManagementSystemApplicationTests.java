package com.hdfc.employeemanagementsystem;

import com.hdfc.employeemanagementsystem.entity.Employee;
import com.hdfc.employeemanagementsystem.repository.IEmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeManagementSystemApplicationTests {

	@Autowired
	IEmployeeRepository employeeRepository;
	@Test
	void contextLoads() {
	}



//	@Test
//	void insertData(){
//		Employee employee = new Employee();
//		employee.setEmployeeId(6);
//		employee.setEmployeeName("Sudya");
//		employee.setEmployeeDateOfBirth("31/10/2000");
//
//		employeeRepository.save(employee);
//	}

	@Test
	void retrieveData(){
		Employee employee = employeeRepository.findById(5).get();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println(employee);
	}
}
