package model.simple;

import model.simple.Bid;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@org.hibernate.annotations.Cache(usage = org.hibernate.annotations.CacheConcurrencyStrategy.READ_WRITE)
public class Item {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Size (min = 2,
    max = 255,
    message = "Name is required, maximum 255 characters."
    )
    protected String name;

    @Future
    protected Date auctionEnd;

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