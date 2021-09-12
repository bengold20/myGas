package ben.study.gas.repository;

import ben.study.gas.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StoreRepository extends JpaRepository<Store, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM Store_B")
    List<Store> selectAllStore(String stores);

    @Query(nativeQuery = true,value = "SELECT * FROM Store_B  WHERE name_store LIKE %?1%")
    List<Store> findStoreByName(String name_store);
}
