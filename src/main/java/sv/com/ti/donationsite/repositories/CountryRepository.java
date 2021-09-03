package sv.com.ti.donationsite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.com.ti.donationsite.domain.entities.CountryEntity;

public interface CountryRepository extends JpaRepository<CountryEntity, Long> {
}
