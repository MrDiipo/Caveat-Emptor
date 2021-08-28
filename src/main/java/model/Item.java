package model;

import java.util.HashSet;
import java.util.Set;

public class Item {

    private Set<Bid> bid = new HashSet<Bid>();


    public Set<Bid> getBids() {
        return bid;
    }

    private void setBids(Set<Bid> bid) {
        this.bid = bid;
    }

    public void addBid(Bid bid){
        if (bid == null) throw new NullPointerException("Can't add null bid!");

        if (bid.getItem() != null) throw new IllegalStateException("Bid is already assigned to an Item.");

        getBids().add(bid);
        bid.setItem(this);
    }
}
