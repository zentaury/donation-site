package sv.com.ti.donationsite.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sv.com.ti.donationsite.domain.DTOs.donation.DonationResource;
import sv.com.ti.donationsite.domain.entities.DonationEntity;
import sv.com.ti.donationsite.repositories.DonationRepository;

import java.util.Date;
import java.util.List;

@Service
public class DonationServiceImpl implements DonationService{

    @Autowired
    private DonationRepository donationRepository;


    @Override
    @Transactional(readOnly = true)
    public List<DonationEntity> findAllByUser(Long userId) {
        return donationRepository.findAllByUser(userId);
    }

    @Override
    public int donationCount(Long donationCountryId, Date month, Date year) {
        return donationRepository.donationCount(donationCountryId, month, year);
    }

    @Override
    @Transactional(readOnly = true)
    public List<DonationResource> findAllDonations(){
        return donationRepository.findAllDonations();
    }

    @Override
    @Transactional
    public void saveDonation(DonationEntity donation) {
        donationRepository.save(donation);
    }

    @Override
    @Transactional
    public void deleteDonation(DonationEntity donation) {
        donationRepository.delete(donation);
    }

    @Override
    @Transactional(readOnly = true)
    public DonationEntity findDonation(DonationEntity donation) {
        return donationRepository.findById(donation.getDonationId()).orElse(null);
    }
}
