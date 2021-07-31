package com.sree.employee.service;

import com.sree.employee.model.Employee;
import com.sree.employee.util.EmployeeUtil;

import java.util.List;

public class EmployeeService {

    //Crud operations


    public String addEmployee(Employee emp) {
        String msg = null;


        if (emp.getEmpId()!= null) {

            EmployeeUtil.empMap.put(emp.getEmpId(), emp);
            msg = "Employee Added";
        } else
            msg = "Employee Added failed";
    }
   return msg;
}
   public Employee getEmployee(Integer empId)  {
       return null;
   }
   public Employee updateEmployee(Integer empId,Employee emp){
       return null;
   }
   public String deleteEmployee(Integer empId)  {
       return null;
   }

      public List<Employee>  getAllEmployees(){
   }
}
