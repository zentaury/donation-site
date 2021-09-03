package sv.com.ti.donationsite.controllers.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sv.com.ti.donationsite.domain.DTOs.donation.DonationResponse;
import sv.com.ti.donationsite.domain.services.DonationService;

import java.util.List;

@RestController
public class DonationsApiController {
    @Autowired
    DonationService donationService;

    @GetMapping("/api/v1/donations")
    public List<DonationResponse> getAllDonations(){

        return donationService.getAllDonationsResponse();
    }
}
