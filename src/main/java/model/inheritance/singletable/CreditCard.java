package model.inheritance.singletable;

import model.inheritance.mappedsuperclass.BillingDetails;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@DiscriminatorValue("CC")
public class CreditCard extends BillingDetails {

    @Id
    @GeneratedValue
    protected Long id;

    @NotNull
    protected String cardNumber;

    @NotNull
    protected String expMonth;

    @NotNull
    protected String  expYear;
}
