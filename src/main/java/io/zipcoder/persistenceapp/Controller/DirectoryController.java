package io.zipcoder.persistenceapp.Controller;

import io.zipcoder.persistenceapp.Service.DirectoryService;
import io.zipcoder.persistenceapp.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DirectoryController {

    @Autowired
    private DirectoryService directoryService;

    @PostMapping("/API/employee")
    public ResponseEntity<Employee> createEmployee (@RequestBody Employee employee){
        return new ResponseEntity<>(directoryService.createEmployee(employee), HttpStatus.CREATED);
    }

}
