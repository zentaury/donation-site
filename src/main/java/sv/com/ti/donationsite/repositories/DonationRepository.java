package sv.com.ti.donationsite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sv.com.ti.donationsite.domain.entities.DonationEntitie;

import java.util.Date;
import java.util.List;

public interface DonationRepository extends JpaRepository<DonationEntitie, Long> {
    @Query(value = "SELECT * FROM donationsite.donation WHERE user_fk = ?", nativeQuery = true)
    List<DonationEntitie> findAllByUser(Long userId);

    @Query(value = "SELECT COUNT(donation.donation_id) FROM donationsite.donation INNER JOIN donationsite.country ON donation.country_fk = country.id WHERE country.id = ? AND MONTH(?) AND YEAR(?)", nativeQuery = true)
    int donationCount(Long donationCountryId, Date month, Date year);
}
