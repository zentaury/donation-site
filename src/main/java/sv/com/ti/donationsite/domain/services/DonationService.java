package sv.com.ti.donationsite.domain.services;

import sv.com.ti.donationsite.domain.entities.DonationEntitie;

import java.util.Date;
import java.util.List;

public interface DonationService {
    public List<DonationEntitie> getAllDonations();

    public List<DonationEntitie> findAllByUser(Long userId);

    public int donationCount(Long donationCountryId, Date month, Date year);

    public void saveDonation(DonationEntitie donation);

    public void deleteDonation(DonationEntitie donation);

    public DonationEntitie findDonation(DonationEntitie donation);
}
