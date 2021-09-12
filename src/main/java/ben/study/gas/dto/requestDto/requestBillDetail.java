package ben.study.gas.dto.requestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class requestBillDetail {

    private int id_bill;
    private int id_warehoureDetail;
    private int gas_id;
    private int quantity;
}
