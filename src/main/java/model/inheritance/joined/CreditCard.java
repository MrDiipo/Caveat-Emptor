package model.inheritance.joined;

import model.inheritance.mappedsuperclass.BillingDetails;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
