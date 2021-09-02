package sv.com.ti.donationsite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.com.ti.donationsite.domain.entities.UserEntitie;

public interface UserRepository extends JpaRepository<UserEntitie, Long> {
    UserEntitie findByUsername(String username);
}
