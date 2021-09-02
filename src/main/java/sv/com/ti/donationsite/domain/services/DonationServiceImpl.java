package sv.com.ti.donationsite.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.com.ti.donationsite.domain.entities.DonationEntitie;
import sv.com.ti.donationsite.repositories.DonationRepository;

import java.util.List;

@Service
public class DonationServiceImpl implements DonationService{

    @Autowired
    private DonationRepository donationRepository;

    @Override
    public List<DonationEntitie> getAllDonations() {
        return donationRepository.findAll();
    }

    @Override
    public void saveDonation(DonationEntitie donation) {
        donationRepository.save(donation);
    }

    @Override
    public void deleteDonation(DonationEntitie donation) {
        donationRepository.delete(donation);
    }

    @Override
    public DonationEntitie findDonation(DonationEntitie donation) {
        return donationRepository.findById(donation.getDonationId()).orElse(null);
    }
}
