package model.inheritance.singletable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "BD_TYPE")
public abstract class BillingDetails {

    @Id
    @GeneratedValue
    protected Long id;

    @NotNull
    @Column(nullable = false)
    protected String owner;
}
