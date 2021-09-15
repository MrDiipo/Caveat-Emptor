package model.inheritance.joined;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@PrimaryKeyJoinColumn(name = "CREDITCARD_ID")
public class CreditCard extends BillingDetails {

    @NotNull
    protected String cardNumber;

    @NotNull
    protected String expMonth;

    @NotNull
    protected String  expYear;
}
