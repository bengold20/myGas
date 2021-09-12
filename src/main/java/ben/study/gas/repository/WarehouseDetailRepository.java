package ben.study.gas.repository;

import ben.study.gas.entity.WarehouseDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WarehouseDetailRepository extends JpaRepository<WarehouseDetail, Integer> {

    @Query(nativeQuery = true, value = "SELECT id_warehouse_Detail, id_warehouse, id_gas, quantity FROM WAREHOUSE_DETAIL_B wd WHERE id_warehouse_Detail like %:id_warehouse_Detail%")
    WarehouseDetail selectWarehouseDetailById(Integer id_warehouse_Detail);

}
