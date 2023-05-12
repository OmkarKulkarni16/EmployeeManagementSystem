package com.hdfc.employeemanagementsystemwebclient.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
    private int EmployeeId;
    private String EmployeeName;
    private String EmployeeDateOfBirth;
}
