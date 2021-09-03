package sv.com.ti.donationsite.domain.DTOs.donation;

import java.util.Date;

public class DonationResponse {
    String userSurname, userName, email, idDocument, countryName, institution;
    Long donationId;
    double donationAmount;
    Date dateDonation;

    public DonationResponse() {
    }

    public DonationResponse(
            String userSurname,
            String userName,
            String email,
            String idDocument,
            String countryName,
            String institution,
            Long donationId,
            double donationAmount,
            Date dateDonation) {
        this.userSurname = userSurname;
        this.userName = userName;
        this.email = email;
        this.idDocument = idDocument;
        this.countryName = countryName;
        this.institution = institution;
        this.donationId = donationId;
        this.donationAmount = donationAmount;
        this.dateDonation = dateDonation;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public Long getDonationId() {
        return donationId;
    }

    public void setDonationId(Long donationId) {
        this.donationId = donationId;
    }

    public double getDonationAmount() {
        return donationAmount;
    }

    public void setDonationAmount(double donationAmount) {
        this.donationAmount = donationAmount;
    }

    public Date getDateDonation() {
        return dateDonation;
    }

    public void setDateDonation(Date dateDonation) {
        this.dateDonation = dateDonation;
    }
}