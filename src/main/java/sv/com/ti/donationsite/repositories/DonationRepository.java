package sv.com.ti.donationsite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sv.com.ti.donationsite.domain.entities.DonationEntity;

import java.util.Date;
import java.util.List;

public interface DonationRepository extends JpaRepository<DonationEntity, Long> {
    @Query(value = "SELECT * FROM donationsite.donation WHERE user_fk = ?", nativeQuery = true)
    List<DonationEntity> findAllByUser(Long userId);

    @Query(value = "SELECT COUNT(donation.donation_id) FROM donationsite.donation INNER JOIN donationsite.country ON donation.country_fk = country.id WHERE country.id = ? AND MONTH(?) AND YEAR(?)", nativeQuery = true)
    int donationCount(Long donationCountryId, Date month, Date year);

    @Query(value = "SELECT user.surnames AS userSurname, user.name AS userName, user.email as email, user.id_document as idDocument , country.name AS countryName, donation.institution AS institution, donation.amount as donationAmount ,donation.donation_id AS donationId, donation.date AS donationDate " +
            "FROM donation INNER JOIN country ON country.id = donation.country_fk INNER JOIN user ON user.user_id = donation.user_fk;", nativeQuery = true)
    List<Object[]> getAllDonations();
}
