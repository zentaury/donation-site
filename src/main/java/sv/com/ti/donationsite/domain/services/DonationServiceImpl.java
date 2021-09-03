package sv.com.ti.donationsite.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sv.com.ti.donationsite.domain.DTOs.donation.DonationResponse;
import sv.com.ti.donationsite.domain.entities.DonationEntity;
import sv.com.ti.donationsite.repositories.DonationRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

    @Override
    public List<DonationResponse> getAllDonationsResponse() {
        List<Object[]> objectList = donationRepository.getAllDonations();
        List<DonationResponse> donationResponseList = new ArrayList<>();
        objectList.forEach( object -> {
            try {
                donationResponseList.add(new DonationResponse(
                        object[0].toString(),
                        object[1].toString(),
                        object[2].toString(),
                        object[3].toString(),
                        object[4].toString(),
                        object[5].toString(),
                        Long.decode(object[7].toString()),
                        Double.parseDouble(object[6].toString()),
                        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(object[8].toString())));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        });
        return  donationResponseList;
    }

}
