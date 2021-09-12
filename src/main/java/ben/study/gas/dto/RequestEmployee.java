package ben.study.gas.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RequestEmployee {

    private String name;
    private int age;
    private String position;
    private String adress;

}
