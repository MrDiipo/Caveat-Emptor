package model.simple;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class User  implements Serializable {

    protected String firstName;
    protected String lastName;

   public String getName(){
       return firstName + " " + lastName;
   }

   public String setName(String name){
       StringTokenizer t = new StringTokenizer(name);
       firstName = t.nextToken();
       lastName = t.nextToken();
   }

    public BigDecimal calcShippingCosts(Address fromLocation){
        // Empty implementation
        return null;
    }
}
