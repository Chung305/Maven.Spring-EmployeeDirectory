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

    @PostMapping("/api/employee")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee e){
        return new ResponseEntity<>(employeeService.create(e), HttpStatus.CREATED);
    }

    @PutMapping("/api/employee/{id}/update_manager")
    public ResponseEntity<Employee> updateEmployee(@PathVariable int id, @RequestBody int managerId){
        return new ResponseEntity<>(employeeService.update(id, managerId), HttpStatus.OK);
    }

    @PutMapping("/api/employee/{id}/update")
    public ResponseEntity<Employee> updateEmployee(@PathVariable int id, @RequestBody Employee e){
        return new ResponseEntity<>(employeeService.update(id, e), HttpStatus.OK);
    }

    @GetMapping("/api/employee/{id}/employee_list_{id}")
    public ResponseEntity<List<Employee>> findAllUnderManager(@PathVariable int id){
        return new ResponseEntity<>(employeeService.findAllUnderManager(id), HttpStatus.OK);
    }
}
