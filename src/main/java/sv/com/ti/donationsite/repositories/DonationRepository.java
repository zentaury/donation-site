package sv.com.ti.donationsite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.com.ti.donationsite.domain.entities.DonationEntitie;

public interface DonationRepository extends JpaRepository<DonationEntitie, Long> {
}
