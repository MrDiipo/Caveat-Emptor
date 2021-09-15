package model.inheritance.joined;

import model.inheritance.singletable.BillingDetails;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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

