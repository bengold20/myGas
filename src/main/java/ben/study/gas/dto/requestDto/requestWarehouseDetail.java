package ben.study.gas.dto.requestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class requestWarehouseDetail {

    private int id_warehouse;
    private int id_gas;
    private int quantity;
}
