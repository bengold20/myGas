package ben.study.gas.controller;

import ben.study.gas.entity.Warehouse;
import ben.study.gas.service.BillDetailService;
import ben.study.gas.service.BillService;
import ben.study.gas.service.GasService;
import ben.study.gas.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WarehouseController {

    @Autowired
    private GasService gasService;

    @Autowired
    private WarehouseService warehouseService;

    @Autowired
    private BillService billService;

    @Autowired
    private BillDetailService billDetailService;

    @PostMapping("/warehouse")
    public Warehouse addWarehouse(@RequestBody Warehouse warehouse){
        return  warehouseService.createWarehouse(warehouse);
    }

    @PostMapping("/warehouses")
    public List<Warehouse> addWareHouses(@RequestBody List<Warehouse> warehouses){
        return warehouseService.createWarehouses(warehouses);
    }

    @GetMapping("/gas")
    public List<String> selectAllGasInStore(@RequestParam String name){
        return warehouseService.selectAllGasInStore(name);
    }

    @PutMapping("/warehouse")
    public Warehouse updateWarehouseById(@PathVariable Warehouse warehouse){
        return warehouseService.updateWarehouseById(warehouse);
    }

    @DeleteMapping("/warehouses")
    public String deleteAllWarehouse(@RequestBody Warehouse warehouse){
        return warehouseService.deleteAllWarehouse(warehouse);
    }
}
