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

    @Query(value = "SELECT d.donation_id, u.surnames as surnames, u.name as name, u.email as email, u.id_document as idDocument, c.name as country, d.institution as institution, d.amount, d.date  FROM donationsite.donation d INNER JOIN country c ON d.country_fk = c.id INNER JOIN user u ON d.user_fk = u.user_id", nativeQuery = true)
    List<DonationEntity> findAllDonations();
}
