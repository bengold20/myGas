package ben.study.gas.dto;

import ben.study.gas.entity.Employee;
import ben.study.gas.entity.Store;
import ben.study.gas.entity.Warehouse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Store_Employee_Gas_Warehouse_dto {

    private Store store;
    private List<RequestEmployee> employees;

}
