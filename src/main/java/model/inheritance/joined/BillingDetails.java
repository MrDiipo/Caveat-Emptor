package model.inheritance.joined;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class BillingDetails {

    @Id
    @GeneratedValue
    protected Long id;

    @NotNull
    @Column(nullable = false)
    protected String owner;
}
