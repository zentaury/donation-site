package sv.com.ti.donationsite.domain.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "country")
public class CountryEntitie {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String iso;
    private String name;
    private String nicename;
    private String iso3;
    @Column(name = "numcode")
    private String numCode;
    private int phonecode;
}
