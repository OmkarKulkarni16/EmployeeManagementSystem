package com.hdfc.employeemanagementsystem.entity;

import javax.persistence.*;

@Entity
@Table(name = "employeeinformation")
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employeeid")
    private int employeeId;

    @Column(name = "employeename")
    private String employeeName;

    @Column(name = "employeedateofbirth")
//    @Convert(converter = AesEncryptor.class)
    private String employeeDateOfBirth;


    public Employee(int employeeId, String employeeName, String employeeDateOfBirth) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeDateOfBirth = employeeDateOfBirth;
    }

    public Employee() {
        super();
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDateOfBirth() {
        return employeeDateOfBirth;
    }

    public void setEmployeeDateOfBirth(String employeeDateOfBirth) {
        this.employeeDateOfBirth = employeeDateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeDateOfBirth='" + employeeDateOfBirth + '\'' +
                '}';
    }
}
