package ben.study.gas.dto.requestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class requestWarehouseAndGas {

    private requestWarehouse warehouse;
    private List<requestGas> gases;
    private requestBill_dto bill;
    private requestBillDetail billDetail;

}
