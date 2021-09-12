package ben.study.gas.repository;

import ben.study.gas.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {

    @Query(nativeQuery = true, value = "SELECT st.name, st.address, wh.name_warehouse, wh.quantity, ga.name_gas, ga.price, ga.color FROM Store_B st JOIN Warehouse_B wh ON st.id_store = wh.id_store JOIN Gas_B ga ON wh.id_gas = ga.id_gas WHERE name LIKE %:name%")
    List<String> selectAllGasInStore(String name);
}
