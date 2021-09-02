package sv.com.ti.donationsite.domain.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "user")
public class UserEntitie implements Serializable {

    private static final long serialVersionUID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name = "country_fk")
    private Long countryId;

    @OneToMany
    @JoinColumn(name = "user_fk")
    private List<RolEntitie> roles;

    private String surnames;
    private String name;
    private String email;
    private String username;
    private String password;
    private String idDocument;
    private String institution;
}
