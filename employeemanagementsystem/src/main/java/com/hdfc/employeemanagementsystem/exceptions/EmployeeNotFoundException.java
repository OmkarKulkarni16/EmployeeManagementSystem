package com.hdfc.employeemanagementsystem.exceptions;

public class EmployeeNotFoundException extends Exception{
    public EmployeeNotFoundException() {
        super("Employee Not Found");
    }

    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
