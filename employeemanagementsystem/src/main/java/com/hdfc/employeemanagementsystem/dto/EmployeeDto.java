package com.hdfc.employeemanagementsystem.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class EmployeeDto {
    private int employeeId;
    private String employeeName;
    private String employeeDateOfBirth;

}
