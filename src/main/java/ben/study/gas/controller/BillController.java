package ben.study.gas.controller;

import ben.study.gas.dto.requestDto.requestBill_dto;
import ben.study.gas.entity.Bill;
import ben.study.gas.service.BillDetailService;
import ben.study.gas.service.BillService;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
public class BillController {

    @Autowired
    private BillService billService;

    @Autowired
    private BillDetailService billDetailService;


    @PostMapping("/bill")
    public Bill addBill(@RequestBody requestBill_dto request){

        Bill bill = new Bill();
        BeanUtils.copyProperties(request.getBill(), bill);
        bill.setName("BillGas - "+RandomStringUtils.randomAlphanumeric(5));

        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        bill.setTime(date);

        return billService.createBill(bill);
    }



    @PostMapping("/bills")
    public List<Bill> addBills(@RequestBody List<Bill> bills){
        return billService.createBills(bills);
    }

    @GetMapping("/bills")
    public List<Bill> selectAllBill() {
        return billService.selectAllBill();
    }


    @DeleteMapping("/bills")
    public String deleteAllBill(@RequestBody Bill bill){
        return billService.deleteAllBill(bill);
    }

}
