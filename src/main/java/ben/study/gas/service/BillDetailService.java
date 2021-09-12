package ben.study.gas.service;

import ben.study.gas.entity.BillDetail;
import ben.study.gas.repository.BillDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillDetailService {

    @Autowired
    private BillDetailRepository billDetailRepository;

    public BillDetail createBillDetail(BillDetail billDetail) {
        return billDetailRepository.save(billDetail);
    }

    public String deleteAllBillDetail(BillDetail billDetail) {
         billDetailRepository.deleteAll();
        return "remove billDetail done!!!";
    }

    public BillDetail addBillDetail(BillDetail billDetail) {
        return billDetailRepository.save(billDetail);
    }

    public List<BillDetail> addBillDetails(List<BillDetail> billDetails) {
        return billDetailRepository.saveAll(billDetails);
    }
}
