package io.zipcoder.persistenceapp.Controller;

import io.zipcoder.persistenceapp.Service.EmployeeService;
import io.zipcoder.persistenceapp.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/api/employee/{id}")
    public ResponseEntity<Employee> findEmployeeById (@PathVariable Long id){
        return new ResponseEntity<>(employeeService.findEmployeeById(id), HttpStatus.OK);
    }
    @PostMapping("/api/employee")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        return new ResponseEntity<>(employeeService.createEmployee(employee), HttpStatus.CREATED);
    }

    @PutMapping("/api/employee/{id}/setManager/{mId}")
    public ResponseEntity<Boolean> updateEmployee(@PathVariable Long mId, @PathVariable Long id){
        return new ResponseEntity<>(employeeService.updateEmployee(id, mId), HttpStatus.OK);
    }

    @PutMapping("/api/employee/{id}/update")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee e){
        return new ResponseEntity<>(employeeService.updateEmployee(id, e), HttpStatus.OK);
    }

}
