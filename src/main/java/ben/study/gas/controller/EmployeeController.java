package ben.study.gas.controller;

import ben.study.gas.entity.Employee;
import ben.study.gas.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @PostMapping("/employees")
    public List<Employee> addEmployees(@RequestBody List<Employee> employees){
        return employeeService.createEmployees(employees);
    }

    @DeleteMapping("/employees")
    public String deleteAllEmployee(@RequestBody Employee employee) {
        return employeeService.deleteAllEmployee(employee);
    }
}
