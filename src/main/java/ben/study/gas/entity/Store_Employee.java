package ben.study.gas.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Store_Employee_B")
public class Store_Employee {

    @Id
    @Column(name = "id_store_employee")
    @GeneratedValue
    private int id;
    private int id_store;
    private int id_employee;
}
