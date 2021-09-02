package sv.com.ti.donationsite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.com.ti.donationsite.domain.entities.TransactionEntitie;

public interface TransactionRepository extends JpaRepository<TransactionEntitie, Long> {
}
