package br.com.alvesmateus.api_alura.address;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String street;
    private String district;
    private String zipCode;
    private String city;
    private String state;
    private String number;

    public Address(AddressData data) {
        this.street = data.street();
        this.district = data.district();
        this.zipCode = data.zipCode();
        this.city = data.city();
        this.state = data.state();
        this.number = data.number();
    }
}
