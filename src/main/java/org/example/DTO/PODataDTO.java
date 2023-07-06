package org.example.DTO;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "PO_Order")
@Getter
public class PODataDTO {

    @Id
    private int id;

    @Column
    private int vendorId;

    @Column
    private Long buyerId;
    @Column
    private String PickUp;
    @Column
    private String Drop;
    @Column
    private String RDD;


    public PODataDTO() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PODataDTO poDataDTO = (PODataDTO) o;
        return Objects.equals(id, poDataDTO.id) && Objects.equals(vendorId, poDataDTO.vendorId) && Objects.equals(buyerId, poDataDTO.buyerId) && Objects.equals(PickUp, poDataDTO.PickUp) && Objects.equals(Drop, poDataDTO.Drop) && Objects.equals(RDD, poDataDTO.RDD);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, vendorId, buyerId, PickUp, Drop, RDD);
    }

    @Override
    public String toString() {
        return "PODataDTO{" +
                "id=" + id +
                ", vendorId=" + vendorId +
                ", buyerId=" + buyerId +
                ", PickUp='" + PickUp + '\'' +
                ", Drop='" + Drop + '\'' +
                ", RDD='" + RDD + '\'' +
                '}';
    }
}
