package ben.study.gas.dto.requestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class requestBill {

    private String name;
    private float total;
    private int id_employee;
    private Date time;
}
