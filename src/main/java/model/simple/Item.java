package model.simple;

import model.simple.Bid;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Entity
@org.hibernate.annotations.Cache(usage = org.hibernate.annotations.CacheConcurrencyStrategy.READ_WRITE)
public class Item {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private Set<Bid> bid = new HashSet<Bid>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Set<Bid> getBids() {
        return Collections.unmodifiableSet(bid);
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
