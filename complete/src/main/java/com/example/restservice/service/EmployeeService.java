package com.example.restservice.service;

import com.example.restservice.model.Address;
import com.example.restservice.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    static List<Employee> employees = new ArrayList<>();

    public List<Employee> getEmployeeList() {
        Employee employee1 = new Employee("Robert", "Lee", 1, "Finance",
                new Address(111, "Long Street", "Montreal"));
        Employee employee2 = new Employee("Julia", "Robinson", 2, "Science",
                new Address(121, "Broad Street", "Sherbrooke"));
        Employee employee3 = new Employee("Myrtle", "Crumbs", 3, "History",
                new Address(132, "Church Place", "Laval"));

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee getById(int id) {
        for(Employee emp : employees) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }

    public Employee getByName(String firstName) {
        for(Employee emp : employees) {
            if (emp.getFirstName().equals(firstName)) {
                return emp;
            }
        }
        return null;
    }
}
