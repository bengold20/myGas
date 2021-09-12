package ben.study.gas.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Warehouse_B")
public class Warehouse {

    @Id
    @Column(name = "id_warehouse")
    @GeneratedValue
    private int id;
    @Column(name = "name_warehouse")
    private String name;
    private int id_store;

}
