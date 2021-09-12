package ben.study.gas.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "WarehouseDetail_B")
public class WarehouseDetail {

    @Id
    @Column(name = "id_warehouseDetail")
    @GeneratedValue
    private int id;
    private int id_warehouse;
    private int id_gas;
    private int quantity;


}
