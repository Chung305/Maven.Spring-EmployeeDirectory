package io.zipcoder.persistenceapp.Service;

import io.zipcoder.persistenceapp.models.Department;
import io.zipcoder.persistenceapp.repository.DepartmentRepository;
import io.zipcoder.persistenceapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    //creating department
    public Department create(Department d){
        return departmentRepository.save(d);
    }

    //update Department manager
    public Department update(int id, int manager){
        Department updated = departmentRepository.findOne(id);
        updated.setManager(employeeRepository.findOne(manager));
        return departmentRepository.save(updated);
    }

    //update department name
    public Department update(int id, String name){
        Department updated = departmentRepository.findOne(id);
        updated.setDepartment_name(name);
        return departmentRepository.save(updated);
    }
}
