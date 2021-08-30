package model.simple;

import java.math.BigDecimal;
import java.util.Date;

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
