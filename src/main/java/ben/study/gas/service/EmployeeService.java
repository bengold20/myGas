package ben.study.gas.service;

import ben.study.gas.entity.Employee;
import ben.study.gas.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public String deleteAllEmployee(Employee employee) {
        employeeRepository.deleteAll();
        return "remove employees finish!!";
    }

    public List<Employee> createEmployees(List<Employee> employees) {
        return employeeRepository.saveAll(employees);
    }
}
