package sv.com.ti.donationsite.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sv.com.ti.donationsite.domain.entities.VisitEntity;
import sv.com.ti.donationsite.repositories.VisitRepository;

import java.util.Date;

@Service
public class VisitServiceImpl implements VisitService{

    @Autowired
    private VisitRepository visitRepository;

    @Override
    @Transactional
    public void saveVisit(VisitEntity visit) {
        visitRepository.save(visit);
    }

    @Override
    @Transactional(readOnly = true)
    public int visitsPerDay(Date day) {
        return visitRepository.getVisitPerDay(day);
    }

    @Override
    @Transactional(readOnly = true)
    public Long allVisits() {
        return visitRepository.count();
    }


}
