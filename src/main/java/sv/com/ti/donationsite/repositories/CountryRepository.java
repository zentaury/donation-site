package sv.com.ti.donationsite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.com.ti.donationsite.domain.entities.CountryEntitie;

public interface CountryRepository extends JpaRepository<CountryEntitie, Long> {
}
