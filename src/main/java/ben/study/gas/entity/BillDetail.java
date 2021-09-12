package ben.study.gas.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Bill_Detail_B")
public class BillDetail {

    @Id
    @Column(name = "id_billDetail")
    @GeneratedValue
    private int id;
    private int id_bill;
    private int id_warehoureDetail;
    private int gas_id;
    private int quantity;

}
