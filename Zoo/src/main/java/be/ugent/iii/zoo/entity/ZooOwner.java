package be.ugent.iii.zoo.entity;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

/**
 *
 * @author Wouter
 */
@Entity
@DiscriminatorValue("O")
public class ZooOwner extends ZooWorker implements Serializable {

    @OneToOne
    @MapsId
    @JoinColumn(name = "zoo_id", unique = true, nullable = true, updatable = true)
    private Zoo zoo;

    public ZooOwner() {
    }

    public ZooOwner(String name, Address address, Zoo zoo) {
        super(name, address);
        this.zoo = zoo;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

}
