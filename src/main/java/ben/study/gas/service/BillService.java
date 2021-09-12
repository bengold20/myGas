package ben.study.gas.service;

import ben.study.gas.entity.Bill;
import ben.study.gas.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    @Autowired
    private BillRepository billRepository;

    public Bill createBill(Bill bill) {
        return billRepository.save(bill);
    }

    public String deleteAllBill(Bill bill) {
        billRepository.deleteAll();
        return "remove bill done!!!";
    }

    public List<Bill> createBills(List<Bill> bills) {
       return billRepository.saveAll(bills);
    }

    public List<Bill> selectAllBill() {
       return billRepository.findAll();
    }
}
