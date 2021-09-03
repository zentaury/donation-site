package sv.com.ti.donationsite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.com.ti.donationsite.domain.entities.RolEntity;

public interface RolRepository extends JpaRepository<RolEntity, Long> {
}
