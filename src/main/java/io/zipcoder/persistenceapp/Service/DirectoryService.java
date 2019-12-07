package io.zipcoder.persistenceapp.Service;

import io.zipcoder.persistenceapp.models.Employee;
import io.zipcoder.persistenceapp.repository.DepartmentRepository;
import io.zipcoder.persistenceapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class DirectoryService {

    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private EmployeeRepository employeeRepository;

//    @Autowired
//    public DirectoryService(DepartmentRepository departmentRepository, EmployeeRepository employeeRepository){
//        this.departmentRepository = departmentRepository;
//        this.employeeRepository = employeeRepository;
//    }

    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
}
