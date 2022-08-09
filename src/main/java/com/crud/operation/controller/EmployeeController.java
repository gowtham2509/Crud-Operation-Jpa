package com.crud.operation.controller;

import com.crud.operation.entity.Employee;
import com.crud.operation.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("insert")
    public ResponseEntity insertData(@RequestBody Employee employee){
         employeeService.createEmp(employee);
         return new ResponseEntity("Created", HttpStatus.OK);
    }

    @GetMapping("/getalldata")
    public List<Employee> getAllData(){
        return employeeService.getAllEmp();
  }

    @GetMapping("get/{id}")
    public Optional<Employee> getById(@PathVariable int id){
        return employeeService.findById(id);
  }

    @PutMapping("/update")
    public ResponseEntity updateData(@RequestBody Employee employee){
         employeeService.updateEmp(employee);
         return new ResponseEntity("Updated",HttpStatus.OK);
  }

    @DeleteMapping("delete/{id}")
    public ResponseEntity deleteData(@PathVariable int id){
         employeeService.delEmp(id);
         return new ResponseEntity("Deleted",HttpStatus.OK);
  }


}
