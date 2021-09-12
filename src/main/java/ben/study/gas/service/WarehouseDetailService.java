package ben.study.gas.service;

import ben.study.gas.entity.WarehouseDetail;
import ben.study.gas.repository.WarehouseDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class WarehouseDetailService {

    @Autowired
    private WarehouseDetailRepository warehouseDetailRepository;

    public WarehouseDetail addWarehouseDetail(WarehouseDetail warehouseDetail) {
        return warehouseDetailRepository.save(warehouseDetail);
    }

    public List<WarehouseDetail> addWarehouseDetails(List<WarehouseDetail> warehouseDetails) {
        return warehouseDetailRepository.saveAll(warehouseDetails);
    }
    @Transactional
    public WarehouseDetail updateWarehouseDetailById(WarehouseDetail warehouseDetail) {

        WarehouseDetail existingWarehouseDetail = warehouseDetailRepository.findById(warehouseDetail.getId()).orElse(null);
        existingWarehouseDetail.setId(warehouseDetail.getId());
        existingWarehouseDetail.setId_warehouse(warehouseDetail.getId_warehouse());
        existingWarehouseDetail.setId_gas(warehouseDetail.getId_gas());
        existingWarehouseDetail.setQuantity(warehouseDetail.getQuantity());

        WarehouseDetail wh = warehouseDetailRepository.save(existingWarehouseDetail);
        System.out.println(wh);
        return wh;
    }

    public WarehouseDetail selectWarehouseDetailById(Integer id_warehouse_Detail) {
        return warehouseDetailRepository.selectWarehouseDetailById(id_warehouse_Detail);
    }
}
