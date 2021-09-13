package model.simple;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
    protected Address homeAddress;


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
