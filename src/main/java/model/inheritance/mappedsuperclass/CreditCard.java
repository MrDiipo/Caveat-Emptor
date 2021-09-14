package model.inheritance.mappedsuperclass;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@AttributeOverride(
        name = "owner",
        column = @Column(name="CC_OWNER", nullable = false)
)
public class CreditCard extends BillingDetails{

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
