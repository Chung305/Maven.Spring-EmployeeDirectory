package io.zipcoder.persistenceapp.Service;

import io.zipcoder.persistenceapp.models.Department;
import io.zipcoder.persistenceapp.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department create(Department d){
        return departmentRepository.save(d);
    }
}
