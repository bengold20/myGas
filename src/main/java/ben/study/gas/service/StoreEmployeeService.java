package ben.study.gas.service;

import ben.study.gas.entity.Store_Employee;
import ben.study.gas.repository.StoreEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreEmployeeService {

    @Autowired
    private StoreEmployeeRepository storeEmployeeRepository;

    public Store_Employee createStoreEmployee(Store_Employee store_employee) {
       return storeEmployeeRepository.save(store_employee);
    }

    public String deleteAllStoreEmployee(Store_Employee store_employee) {
        storeEmployeeRepository.deleteAll();
        return "remove finish!!!";
    }


    public List<String> selectAllEmployeeInStore(String name_store) {
        return storeEmployeeRepository.selectAllEmployeeInStore(name_store);
    }

    public List<Store_Employee> createStoreEmployees(List<Store_Employee> store_employees) {
        return storeEmployeeRepository.saveAll(store_employees);
    }
}
