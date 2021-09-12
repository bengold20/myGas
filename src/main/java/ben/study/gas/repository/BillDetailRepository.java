package ben.study.gas.repository;

import ben.study.gas.entity.BillDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillDetailRepository extends JpaRepository<BillDetail, Integer> {

}
