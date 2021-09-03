package sv.com.ti.donationsite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sv.com.ti.donationsite.domain.entities.DonationEntitie;

import java.util.List;

public interface DonationRepository extends JpaRepository<DonationEntitie, Long> {
    @Query(value = "SELECT * FROM donationsite.donation WHERE user_fk = ?", nativeQuery = true)
    List<DonationEntitie> findAllByUser(Long userId);
}
