package ben.study.gas.dto.requestDto;

import ben.study.gas.entity.Bill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class requestBill_dto {

    private Bill bill;

}
