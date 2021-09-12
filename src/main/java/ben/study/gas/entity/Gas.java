package ben.study.gas.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Gas_B")
public class Gas {

    @Id
    @Column(name = "id_gas")
    @GeneratedValue
    private int id;
    @Column(name = "name_gas")
    private String name;
    private float price;
    private String color;


}
