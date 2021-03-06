package model.inheritance.tableperclass;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class BankAccount extends BillingDetails {

    @Id
    @GeneratedValue
    protected Long id;

    @NotNull
    protected String cardNumber;

    @NotNull
    protected String expMonth;

    @NotNull
    protected String expYear;
}

