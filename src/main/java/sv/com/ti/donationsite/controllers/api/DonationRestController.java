package sv.com.ti.donationsite.controllers.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sv.com.ti.donationsite.domain.DTOs.RestResponse;
import sv.com.ti.donationsite.domain.entities.DonationEntity;
import sv.com.ti.donationsite.domain.services.DonationService;

import java.util.List;

@RestController
public class DonationRestController {

    @Autowired
    private DonationService donationService;


    @GetMapping("/api/v1/donations")
    public ResponseEntity getAllDonations(){
        try{
            List<DonationEntity> donations = donationService.findAllDonations();
            return ResponseEntity.ok(new RestResponse(true, "OK", donations));
        }catch (Exception exception){
            return ResponseEntity.badRequest().body(new RestResponse(false, exception.getMessage(), null));
        }
    }
}
