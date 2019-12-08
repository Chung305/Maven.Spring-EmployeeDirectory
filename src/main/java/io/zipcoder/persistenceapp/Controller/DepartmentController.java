package io.zipcoder.persistenceapp.Controller;

import io.zipcoder.persistenceapp.Service.DepartmentService;
import io.zipcoder.persistenceapp.models.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/api/department")
    public ResponseEntity<Department> create (@RequestBody Department d){
        return new ResponseEntity<>(departmentService.create(d), HttpStatus.CREATED);
    }

    @PutMapping("/api/department/{id}/update")
    public ResponseEntity<Department> update (@PathVariable int id, @RequestBody int managerId){
        return new ResponseEntity<>(departmentService.update(id, managerId), HttpStatus.OK);
    }

    @PutMapping("/api/department/{id}/update_name")
    public ResponseEntity<Department> update (@PathVariable int id, @RequestBody String name){
        return new ResponseEntity<>(departmentService.update(id, name), HttpStatus.OK);
    }
}
