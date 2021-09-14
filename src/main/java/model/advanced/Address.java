package model.advanced;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class Address {

    @NotNull
    @Column(nullable = false)
    protected String street;


    @NotNull
    @Column(nullable = false,length = 5)
    protected String zipcode;

    @NotNull
    @AttributeOverrides(@AttributeOverride(name = "name",
    column = @Column(name = "CITY", nullable = false)))
    protected City city;

    protected Address() {
    }

    public Address(String street, String zipcode, City city) {
        this.street = street;
        this.zipcode = zipcode;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
