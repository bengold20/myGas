package ben.study.gas.repository;

import ben.study.gas.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BillRepository extends JpaRepository<Bill, Integer> {

}
