package ben.study.gas.controller;

import ben.study.gas.entity.Store_Employee;
import ben.study.gas.repository.StoreEmployeeRepository;
import ben.study.gas.service.StoreEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Access;
import java.util.List;

@RestController
public class StoreEmployeeController {

    @Autowired
    private StoreEmployeeService storeEmployeeService;

    @PostMapping("/store-employee")
    public Store_Employee addStore_Employee(@RequestBody Store_Employee store_employee){
        return storeEmployeeService.createStoreEmployee(store_employee);
    }

    @PostMapping("/store-employees")
    public List<Store_Employee> addStore_Employees(@RequestBody List<Store_Employee> store_employees){
        return storeEmployeeService.createStoreEmployees(store_employees);
    }

    @GetMapping("/store-employee")
    public List<String> selectAllEmployeeInStoreByName(@RequestParam String name_store){
        return storeEmployeeService.selectAllEmployeeInStore(name_store);
    }

    @DeleteMapping("/stores-employees")
    public String deleteAllStoreEmployee(@RequestBody Store_Employee store_employee){
        return storeEmployeeService.deleteAllStoreEmployee(store_employee);
    }
}
