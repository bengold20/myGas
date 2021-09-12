package ben.study.gas.repository;

import ben.study.gas.entity.Gas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GasRepository extends JpaRepository<Gas, Integer> {

    @Query(nativeQuery = true, value = "SELECT st.name_store, st.address, gs.name_gas, gs.price, gs.color FROM Gas_B gs JOIN Warehouse_Detail_B wd ON gs.id_gas = wd.id_gas JOIN Warehouse_B wh ON wd.id_warehouse = wh.id_warehouse JOIN Store_B st ON wh.id_store = st.id_store WHERE name_store LIKE %:name_store%")
    List<String> selectGasInStoreByName(String name_store);

}
