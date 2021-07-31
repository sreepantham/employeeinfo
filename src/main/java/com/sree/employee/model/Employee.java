package com.sree.employee.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Employee {
    private int empId;
    private String fName;
    private String lName;
    private String email;
}
