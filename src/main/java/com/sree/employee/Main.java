package com.sree.employee;

import com.sree.employee.model.Employee;
import com.sree.employee.service.EmployeeService;
import com.sree.employee.util.EmployeeUtil;


public class Main {
    public static void main(String[] args){
        EmployeeService empService=new EmployeeService();
        empService.addEmployee(addEmployee(765,"Druvitha","Thota","druvitha@gmail.com"));
        empService.addEmployee(addEmployee(123,"Jasmitha","Thota","jasmitha@gmail.com"));
        System.out.println(("Employee Map Size"+ EmployeeUtil.empMap.size()));

    }
    static Employee addEmployee(Integer empId,String fName,String lName,String email){
        Employee emp=new Employee();
        emp.setEmpId(empId);
        emp.setFName(fName);
        emp.setLName(lName);
        emp.setEmail(email);

        return emp;
    }
   // static Employee getEmployee(Integer empId,String fName,String lName,String email){

    }
}
