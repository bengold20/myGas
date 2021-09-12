package ben.study.gas.controller;

import ben.study.gas.entity.Bill;
import ben.study.gas.entity.BillDetail;
import ben.study.gas.entity.WarehouseDetail;
import ben.study.gas.repository.WarehouseDetailRepository;
import ben.study.gas.service.BillDetailService;
import ben.study.gas.service.WarehouseDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class BillDetailController {

    @Autowired
    private BillDetailService billDetailService;

    @Autowired
    private WarehouseDetailRepository warehouseDetailRepository;

    @Autowired
    private WarehouseDetailService warehouseDetailService;

    @PostMapping("/bill-detail")
    @Transactional
    public BillDetail addBillDetail(@RequestBody BillDetail billDetail) {


        WarehouseDetail whdt = warehouseDetailRepository.selectWarehouseDetailById(billDetail.getId_warehoureDetail());

        WarehouseDetail whdtupdate = warehouseDetailService.updateWarehouseDetailById(whdt);
        whdtupdate.setId(whdt.getId());
        whdtupdate.setId_warehouse(whdt.getId_warehouse());
        whdtupdate.setId_gas(whdt.getId_gas());
        whdtupdate.setQuantity(whdt.getQuantity() + billDetail.getQuantity());

        return billDetailService.addBillDetail(billDetail);
    }

    @PostMapping("/bill-details")
    public List<BillDetail> addBillDetails(@RequestBody List<BillDetail> billDetails){
        return billDetailService.addBillDetails(billDetails);
    }

    @DeleteMapping("/bills-details")
    public String deleteAllBillDetail(@RequestBody BillDetail billDetail){
        return billDetailService.deleteAllBillDetail(billDetail);
    }
}
