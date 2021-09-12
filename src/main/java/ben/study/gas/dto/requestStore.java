package ben.study.gas.dto;

import ben.study.gas.entity.Store;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class requestStore {

    private Store store;
}
