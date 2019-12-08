package io.zipcoder.persistenceapp.Service;


import io.zipcoder.persistenceapp.models.Employee;
import io.zipcoder.persistenceapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    //create employee
    public Employee create(Employee e){
        return employeeRepository.save(e);
    }

    //update manager of employee
    public Employee update(int id, int managerId){
        Employee e = employeeRepository.findOne(id);
        e.setManager(employeeRepository.findOne(managerId));
        return employeeRepository.save(e);
    }

    //update employee fields
    public Employee update (int id, Employee employee){
        Employee e = employeeRepository.findOne(id);
        e.setFirst_name(employee.getFirst_name());
        e.setLast_name(employee.getLast_name());
        e.setTitle(employee.getTitle());
        e.setPhone_number(employee.getPhone_number());
        e.setEmail(employee.getEmail());
        e.setHire_date(employee.getHire_date());
        e.setDepartment_Key(employee.getDepartment_Key());
        return employeeRepository.save(e);
    }

    //get all employees under a manager
    public List<Employee> findAllUnderManager(int id){
        Iterable<Employee> list = employeeRepository.findAll();
        List<Employee> underManager = new ArrayList<>();
        for(Employee each : list){
            if(each.getManager().equals(employeeRepository.findOne(id)))
                underManager.add(each);
        }
        return underManager;
    }



}
