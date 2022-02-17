package com.example.restservice.api;

import com.example.restservice.model.Employee;
import com.example.restservice.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class EmployeeController {

    EmployeeService employeeService = new EmployeeService();

    @GetMapping("/employee")
    public List<Employee> getAllEmployees() {
        return employeeService.getEmployeeList();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeService.getById(id);
    }

    @GetMapping("/employeename")
    public Employee getEmployeeByName(@RequestParam(value="firstname", defaultValue = "Robert") String firstname) {
        return employeeService.getByName(firstname);
    }

    @PostMapping("/employee")
    public Employee newEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return employee;
    }
}
