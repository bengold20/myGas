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
@Table(name = "Employee_B")
public class Employee {

    @Id
     @Column(name = "id_employee")
     @GeneratedValue
     private int id;
    @Column(name = "name_employee")
     private String name;
     private int age;
     private String position;
     private String adress;

}
