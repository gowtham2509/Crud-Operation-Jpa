package com.crud.operation.service.impl;

import com.crud.operation.entity.Employee;
import com.crud.operation.repository.EmployeeRepository;
import com.crud.operation.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void createEmp(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmp() {
       return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> findById(int id) {
        return employeeRepository.findById(id);
    }

    @Override
    public void updateEmp(Employee employee) {
         employeeRepository.saveAndFlush(employee);
    }

    @Override
    public void delEmp(int id) {
        employeeRepository.deleteById(id);
    }
}
