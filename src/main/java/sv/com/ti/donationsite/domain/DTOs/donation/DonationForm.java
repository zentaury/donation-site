package sv.com.ti.donationsite.domain.DTOs.donation;

public class DonationForm {
    String UserName, Surname, Institution, CardOwner, CardNumber, Expiration, CVV;
    Long CountryId;
    Double Amount;

    public DonationForm(
            String userName,
            String surname,
            String institution,
            String cardOwner,
            String cardNumber,
            String expiration,
            String CVV,
            Long countryId,
            Double Amount) {
        UserName = userName;
        Surname = surname;
        Institution = institution;
        CardOwner = cardOwner;
        CardNumber = cardNumber;
        Expiration = expiration;
        this.CVV = CVV;
        CountryId = countryId;
        this.Amount = Amount;
    }

    public DonationForm() {

    }
    public void setAmount(Double amount) {
        Amount = amount;
    }

    public Double getAmount() {
        return Amount;
    }

    public String getUserName() {
        return UserName;
    }

    public String getSurname() {
        return Surname;
    }

    public String getInstitution() {
        return Institution;
    }

    public String getCardOwner() {
        return CardOwner;
    }

    public String getCardNumber() {
        return CardNumber;
    }

    public String getExpiration() {
        return Expiration;
    }

    public String getCVV() {
        return CVV;
    }

    public Long getCountryId() {
        return CountryId;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setInstitution(String institution) {
        Institution = institution;
    }

    public void setCardOwner(String cardOwner) {
        CardOwner = cardOwner;
    }

    public void setCardNumber(String cardNumber) {
        CardNumber = cardNumber;
    }

    public void setExpiration(String expiration) {
        Expiration = expiration;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    public void setCountryId(Long countryId) {
        CountryId = countryId;
    }
}
