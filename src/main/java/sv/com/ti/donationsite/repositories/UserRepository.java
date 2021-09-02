package sv.com.ti.donationsite.repositories;

import org.springframework.data.repository.CrudRepository;
import sv.com.ti.donationsite.domain.entities.UserEntitie;

public interface UserRepository extends CrudRepository<UserEntitie, Long> {
}
