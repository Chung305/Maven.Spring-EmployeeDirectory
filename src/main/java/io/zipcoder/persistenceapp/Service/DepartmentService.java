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

    public Department createDepartment(Department department){
        Department d = new Department();
        d.setDepartmentName(department.getDepartmentName());
        return departmentRepository.save(d);
    }

    public Department updateDepartmentManager(Long id, Long managerId){
        Department updated = departmentRepository.findOne(id);
        updated.setManager(employeeRepository.findOne(managerId));

        return departmentRepository.save(updated);

    }

    public Department updateDepartmentName(Long id, String name){
        Department updated = departmentRepository.findOne(id);
        updated.setDepartmentName(name);
        return departmentRepository.save(updated);
    }


}
