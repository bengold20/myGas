package ben.study.gas.controller;

import ben.study.gas.entity.WarehouseDetail;
import ben.study.gas.service.WarehouseDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WarehouseDetailController {

    @Autowired
    private WarehouseDetailService warehouseDetailService;

    @PostMapping("/warehouse-detail")
    public WarehouseDetail addWarehouseDetail(@RequestBody WarehouseDetail warehouseDetail){
        return warehouseDetailService.addWarehouseDetail(warehouseDetail);
    }

    @PostMapping("/warehouse-details")
    public List<WarehouseDetail> addWarehouseDetails(@RequestBody List<WarehouseDetail> warehouseDetails){
        return warehouseDetailService.addWarehouseDetails(warehouseDetails);
    }

    @GetMapping("/warehouse-detail")
    public WarehouseDetail selectWarehouseDetailById(@RequestParam Integer id_warehouse_Detail){
        return warehouseDetailService.selectWarehouseDetailById(id_warehouse_Detail);
    }


    @PutMapping("warehouse-detail")
    public WarehouseDetail updateWarehouseDetailById(@PathVariable WarehouseDetail warehouseDetail){
        return warehouseDetailService.updateWarehouseDetailById(warehouseDetail);
    }

}
