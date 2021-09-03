package sv.com.ti.donationsite.domain.services;

import sv.com.ti.donationsite.domain.entities.DonationEntity;

import java.util.Date;
import java.util.List;

public interface DonationService {
    List<DonationEntity> findAllDonations();

    public List<DonationEntity> findAllByUser(Long userId);

    public int donationCount(Long donationCountryId, Date month, Date year);

    public void saveDonation(DonationEntity donation);

    public void deleteDonation(DonationEntity donation);

    public DonationEntity findDonation(DonationEntity donation);
}
