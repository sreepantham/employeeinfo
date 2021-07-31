package com.sree.employee.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Employee {
    private Integer empId;
    private String  fName;
    private String lName;
    private String email;

}
