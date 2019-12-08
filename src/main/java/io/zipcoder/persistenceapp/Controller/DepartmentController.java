package io.zipcoder.persistenceapp.Controller;

import io.zipcoder.persistenceapp.Service.DepartmentService;
import io.zipcoder.persistenceapp.models.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/api/department")
    public ResponseEntity<Department> create (@RequestBody Department d){
        return new ResponseEntity<>(departmentService.create(d), HttpStatus.CREATED);
    }
}
