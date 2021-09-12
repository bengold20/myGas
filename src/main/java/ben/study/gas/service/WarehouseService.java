package ben.study.gas.service;

import ben.study.gas.entity.Warehouse;
import ben.study.gas.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseService {

    @Autowired
    private WarehouseRepository warehouseRepository;

    public Warehouse createWarehouse(Warehouse warehouse) {
        return warehouseRepository.save(warehouse);
    }

    public String deleteAllWarehouse(Warehouse warehouse) {
        warehouseRepository.deleteAll();
        return "remove warehouse done!!!";
    }

    public List<String> selectAllGasInStore(String name) {
        return warehouseRepository.selectAllGasInStore(name);
    }

    public List<Warehouse> createWarehouses(List<Warehouse> warehouses) {
        return warehouseRepository.saveAll(warehouses);
    }

    public Warehouse updateWarehouseById(Warehouse warehouse) {
        Warehouse existingWarehouse =warehouseRepository.findById(warehouse.getId()).orElse(null);
        existingWarehouse.setId(warehouse.getId());
        existingWarehouse.setName(warehouse.getName());
        return warehouseRepository.save(existingWarehouse);
    }
}
