package br.com.alvesmateus.api_alura.doctor;

import br.com.alvesmateus.api_alura.address.Address;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "doctors")
@Entity(name = "Doctor")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Doctor {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Expertise expertise;

    @Embedded
    private Address address;

    public Doctor(RegisterDoctorData data) {
        this.name = data.name();
        this.email = data.email();
        this.crm = data.crm();
        this.expertise = data.expertise();
        this.address = new Address(data.address());
    }
}
