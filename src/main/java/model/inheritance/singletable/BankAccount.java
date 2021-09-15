package model.inheritance.singletable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@DiscriminatorValue("BA")
public class BankAccount extends BillingDetails {

    @Id
    @GeneratedValue
    protected Long id;

    @NotNull
    protected String account;

    @NotNull
    protected String bankName;

    @NotNull
    protected String swift;
}

