package ben.study.gas.controller;

import ben.study.gas.dto.RequestEmployee;
import ben.study.gas.dto.Store_Employee_Gas_Warehouse_dto;
import ben.study.gas.dto.requestStore;
import ben.study.gas.entity.*;
import ben.study.gas.repository.WarehouseDetailRepository;
import ben.study.gas.service.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class StoreController {

    @Autowired
    private StoreService storeService;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private StoreEmployeeService storeEmployeeService;

    @Autowired
    private WarehouseService warehouseService;

    @Autowired
    private GasService gasService;

    @PostMapping("/store")
    public Store addStore(@RequestBody requestStore request){
        Store store = new Store();
        BeanUtils.copyProperties(request.getStore(), store);
        return storeService.createStore(store);
    }

    @PostMapping("/stores")
    public List<Store> addStores(@RequestBody List<Store> stores){
        return storeService.createStores(stores);
    }

    @GetMapping("/stores")
    public List<Store> selectAllStore(){

        return storeService.selectAllStore();
    }

    @GetMapping("/store")
    public List<Store> selectStoreByName(@RequestParam String name_store){
        return storeService.selectStoreByName(name_store);
    }

    @DeleteMapping("/stores")
    public String deleteAllStore(@RequestBody Store store){
          return storeService.deleteAllStore(store);
    }


//    @PostMapping("/store-employee")
//    public String add_Store_Employee_Warehouse_Gas(@RequestBody Store_Employee_Gas_Warehouse_dto request){
//        Store store = new Store();
//        BeanUtils.copyProperties(request.getStore(), store);
//        Store st = storeService.createStore(store);
//        List<RequestEmployee> employees = request.getEmployees();
//        for(RequestEmployee item : employees){
//            Employee employee = new Employee();
//            BeanUtils.copyProperties(item, employee);
//            Employee em = employeeService.createEmployee(employee);
//            Store_Employee store_employee = new Store_Employee();
//            store_employee.setId_store(st.getId());
//            store_employee.setId_employee(em.getId());
//            storeEmployeeService.createStoreEmployee(store_employee);
//        }
//
//        return "add store and employee done!!!" + store + employees;
//    }
}
