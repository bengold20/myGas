package ben.study.gas.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Bill_B")
public class Bill {

    @Id
    @Column(name = "id_bill")
    @GeneratedValue
    private int id;
    @Column(name = "code_bill")
    private String name;
    private float total;
    private int id_employee;
    private Date time;







//    @OneToMany(mappedBy = "", cascade = CascadeType.ALL)
//    private List<Employee> employees;




}
