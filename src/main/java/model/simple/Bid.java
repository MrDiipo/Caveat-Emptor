package model.simple;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@org.hibernate.annotations.Immutable
public class Bid {

    private Item item;

    private BigDecimal amount;
    private Date createdOn;

    public Item getItem() {
        return item;
    }

    void setItem(Item item) {
        this.item = item;
    }
}
