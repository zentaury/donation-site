package sv.com.ti.donationsite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.com.ti.donationsite.domain.entities.RolEntitie;

public interface RolRepository extends JpaRepository<RolEntitie, Long> {
}
