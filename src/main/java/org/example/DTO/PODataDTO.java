package org.example.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PO_Order")
public class PODataDTO {

    @Id
    private Long id;

    @Column
    private Long VendorId;

    @Column
    private Long buyerId;
    @Column
    private String PickUp;
    @Column
    private String Drop;
    @Column
    private String RDD;

}
