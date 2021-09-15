package model.inheritance.embeddable;

import javax.persistence.Entity;

@Entity
public class Item {

    protected Dimensions dimensions;

    protected Weight weight;
}
