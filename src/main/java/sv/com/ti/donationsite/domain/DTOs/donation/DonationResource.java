package sv.com.ti.donationsite.domain.DTOs.donation;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class DonationResource {

    Long id;
    String surnames, name, email, idDocument, country, institution, donationAmount;
    Date dateDonation;

    public DonationResource(Long id, String surnames, String name, String email, String idDocument, String country, String institution, String donationAmount, Date dateDonation) {
        this.id = id;
        this.surnames = surnames;
        this.name = name;
        this.email = email;
        this.idDocument = idDocument;
        this.country = country;
        this.institution = institution;
        this.donationAmount = donationAmount;
        this.dateDonation = dateDonation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(String idDocument) {
        this.idDocument = idDocument;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getDonationAmount() {
        return donationAmount;
    }

    public void setDonationAmount(String donationAmount) {
        this.donationAmount = donationAmount;
    }

    public Date getDateDonation() {
        return dateDonation;
    }

    public void setDateDonation(Date dateDonation) {
        this.dateDonation = dateDonation;
    }

    @Override
    public String toString(){
        return "DonationResource [id="+id+", surnames="+surnames+", name="+name+", email="+email+", idDocument="+idDocument+", country="+country+", institution="+institution+", donationAmount="+donationAmount+", dateDonation="+dateDonation+"]";
    }
}
