package sv.com.ti.donationsite.domain.services;

import sv.com.ti.donationsite.domain.entities.VisitEntity;

import java.util.Date;

public interface VisitService {

    public void saveVisit(VisitEntity visit);

    public int visitsPerDay(Date day);

    public Long allVisits();
}
