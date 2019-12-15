package io.zipcoder.persistenceapp.Service;


import io.zipcoder.persistenceapp.models.Department;
import io.zipcoder.persistenceapp.models.Employee;
import io.zipcoder.persistenceapp.repository.DepartmentRepository;
import io.zipcoder.persistenceapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee findEmployeeById(Long id){
        return employeeRepository.findOne(id);
    }

    public Employee createEmployee(Employee employee){
        Employee newEmployee = new Employee();
        newEmployee.setFirst_name(employee.getFirst_name());
        newEmployee.setLast_name(employee.getLast_name());
        newEmployee.setTitle(employee.getTitle());
        newEmployee.setPhone_number(employee.getPhone_number());
        newEmployee.setEmail(employee.getEmail());
        newEmployee.setHire_date(new Date());

        return employeeRepository.save(newEmployee);

    }
     public Boolean updateEmployee(Long employeeId, Long managerId){
        try{
            verifyEmployee(employeeId);
            Employee updateEmployee = employeeRepository.findOne(employeeId);
            updateEmployee.setManager(employeeRepository.findOne(managerId));
            employeeRepository.save(updateEmployee);
            return true;
        }catch(IllegalArgumentException e){
            e.printStackTrace();
        }
        return false;
     }

     public Employee updateEmployee(Long id, Employee employee) {
         Employee updated = findEmployeeById(id);
         updated.setFirst_name(employee.getFirst_name());
         updated.setLast_name(employee.getLast_name());
         updated.setTitle(employee.getTitle());
         updated.setPhone_number(employee.getPhone_number());
         updated.setEmail(employee.getEmail());

         return employeeRepository.save(updated);
     }
     ////IM HERE BRO
     public List<Employee> listUnderAManager (Long id){
        return null;
     }


    public void verifyEmployee(Long employeeId) {
        if(!employeeRepository.exists(employeeId))   {
            throw new IllegalArgumentException("not found");
        }
    }





}
