package model;

import java.util.HashSet;
import java.util.Set;

public class Item {

    private Set<Bid> bid = new HashSet<Bid>();


    public Set<Bid> getBid() {
        return bid;
    }

    public void setBid(Set<Bid> bid) {
        this.bid = bid;
    }
}
