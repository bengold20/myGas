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
@Table(name = "Store_B")
public class Store {

    @Id
    @Column(name = "id_store")
    @GeneratedValue
    private int id;
    @Column(name = "name_store")
    private String name;
    private String address;

}
