package ben.study.gas.repository;

import ben.study.gas.entity.Store_Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StoreEmployeeRepository extends JpaRepository<Store_Employee, Integer> {

    @Query(nativeQuery = true, value = "SELECT st.name_store, st.address, el.name_employee, el.age, el.position, el.adress FROM Store_B st JOIN Store_Employee_B se ON st.id_store = se.id_store JOIN Employee_B el ON se.id_employee = el.id_employee WHERE name_store LIKE %:name_store%")
    List<String> selectAllEmployeeInStore(String name_store);
}
