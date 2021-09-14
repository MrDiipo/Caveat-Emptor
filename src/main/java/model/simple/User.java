package model.simple;

import model.advanced.coverter.ZipcodeConverter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.StringTokenizer;

@Entity
@Table(name = "USERS")
public class User  implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    protected String firstName;
    protected String lastName;

    @Convert(converter = ZipcodeConverter.class,
    attributeName = "zipcode")
    protected Address homeAddress;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street",
                    column = @Column(name = "BILLING_STREET")),
            @AttributeOverride(name = "zipcode",
                    column = @Column(name = "BILLING_ZIPCODE", length = 5)),
            @AttributeOverride(name = "city",
                    column = @Column(name = "BILLING_CITY"))
    })
    protected Address billingAddress;

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }


    public String getName(){
       return firstName + " " + lastName;
   }

   public void setName(String name){
       StringTokenizer t = new StringTokenizer(name);
       firstName = t.nextToken();
       lastName = t.nextToken();
   }

    public BigDecimal calcShippingCosts(Address fromLocation){
        // Empty implementation
        return null;
    }
}
