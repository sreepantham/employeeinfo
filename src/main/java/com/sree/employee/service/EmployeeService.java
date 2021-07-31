package com.sree.employee.service;

import com.sree.employee.model.Employee;
import com.sree.employee.util.EmployeeUtil;

public class EmployeeService {


    //CRUD operations

    public String addEmployee(Employee emp){
        String mess=null;
        if(emp.getEmpId()!=null){
            EmployeeUtil.empMap.put(emp.getEmpId(), emp);
            mess="Employee Added";
        }
        else{
            mess="Employee failed to add";

        }
        return mess;
    }
    public Employee getEmployee(Integer empId){
        return null;
    }
    public Employee updateEmployee(Integer empId){
        return null;
    }
    public String deleteEmployee(Integer empId){
        return null;
    }
}
