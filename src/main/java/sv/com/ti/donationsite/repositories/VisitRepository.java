package sv.com.ti.donationsite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sv.com.ti.donationsite.domain.entities.VisitEntity;

import java.util.Date;

public interface VisitRepository extends JpaRepository<VisitEntity, Long> {

    @Query(value = "SELECT COUNT(visit.visit_id) FROM donationsite.visit WHERE DAY(?) = DAY(NOW())", nativeQuery = true)
    int getVisitPerDay(Date day);


}
