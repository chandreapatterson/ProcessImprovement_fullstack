package com.globalcontrols.processimprovement.controller;

import com.globalcontrols.processimprovement.dto.EmployeeDTO;
import com.globalcontrols.processimprovement.model.Employee;
import com.globalcontrols.processimprovement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<EmployeeDTO> getEmployees() {
        return employeeService.getEmployeesByEmpNoRange(10001L, 10005L);
    }


    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }
}