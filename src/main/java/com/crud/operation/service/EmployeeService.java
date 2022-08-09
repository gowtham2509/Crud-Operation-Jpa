package com.crud.operation.service;

import com.crud.operation.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
     void createEmp(Employee employee);
     List<Employee> getAllEmp();
     Optional<Employee> findById(int id);
     void updateEmp(Employee employee);
     void delEmp(int id);
}
