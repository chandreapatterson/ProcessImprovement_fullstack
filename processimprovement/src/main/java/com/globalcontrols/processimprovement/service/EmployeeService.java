package com.globalcontrols.processimprovement.service;

import com.globalcontrols.processimprovement.dto.EmployeeDTO;
import com.globalcontrols.processimprovement.model.Employee;
import com.globalcontrols.processimprovement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    
    // Method to get employees by emp_no range and map to EmployeeDTO
    public List<EmployeeDTO> getEmployeesByEmpNoRange(Long startEmpNo, Long endEmpNo) {
        return employeeRepository.findByEmpNoBetween(startEmpNo, endEmpNo)
                .stream()
                .map(employee -> new EmployeeDTO(
                        employee.getEmpNo(),
                        employee.getBirthDate(),
                        employee.getFirstName(),
                        employee.getLastName(),
                        employee.getGender(),
                        employee.getHireDate()))
                .collect(Collectors.toList());
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }
    
    public List<Employee> getEmployeesInRange(Long start, Long end) {
        return employeeRepository.findByEmpNoBetween(start, end);
    }
}