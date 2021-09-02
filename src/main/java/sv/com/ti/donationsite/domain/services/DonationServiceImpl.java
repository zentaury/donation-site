package sv.com.ti.donationsite.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sv.com.ti.donationsite.domain.entities.DonationEntitie;
import sv.com.ti.donationsite.repositories.DonationRepository;

import java.util.List;

@Service
public class DonationServiceImpl implements DonationService{

    @Autowired
    private DonationRepository donationRepository;

    @Override
    @Transactional(readOnly = true)
    public List<DonationEntitie> getAllDonations() {
        return donationRepository.findAll();
    }

    @Override
    @Transactional
    public void saveDonation(DonationEntitie donation) {
        donationRepository.save(donation);
    }

    @Override
    @Transactional
    public void deleteDonation(DonationEntitie donation) {
        donationRepository.delete(donation);
    }

    @Override
    @Transactional(readOnly = true)
    public DonationEntitie findDonation(DonationEntitie donation) {
        return donationRepository.findById(donation.getDonationId()).orElse(null);
    }
}
