package sv.com.ti.donationsite.domain.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

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
    private String surnames;
    private String name;
    private String email;
    private String username;
    private String password;
    private String idDocument;
    private String institution;

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIdDocument(String idDocument) {
        this.idDocument = idDocument;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getCountryId() {
        return countryId;
    }

    public String getSurnames() {
        return surnames;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getIdDocument() {
        return idDocument;
    }

    public String getInstitution() {
        return institution;
    }
}
