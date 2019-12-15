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
    public ResponseEntity<Department> createDepartment(@RequestBody Department d){
        return new ResponseEntity<>(departmentService.createDepartment(d), HttpStatus.CREATED);
    }

    @PutMapping("/api/department/{id}/updateManager/{mId}")
    public ResponseEntity<Department> updateDepartmentManager(@PathVariable Long id, @PathVariable Long mId){
        return new ResponseEntity<>(departmentService.updateDepartmentManager(id, mId), HttpStatus.OK);
    }

    @PutMapping("/api/department/{id}/nameUpdate")
    public ResponseEntity<Department> updateDepartmentName(@PathVariable Long id, @RequestBody String name){
        return new ResponseEntity<>(departmentService.updateDepartmentName(id, name), HttpStatus.OK);
    }


}
