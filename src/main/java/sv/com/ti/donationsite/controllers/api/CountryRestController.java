package sv.com.ti.donationsite.controllers.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sv.com.ti.donationsite.domain.DTOs.RestResponse;
import sv.com.ti.donationsite.domain.entities.CountryEntitie;
import sv.com.ti.donationsite.domain.services.CountryService;

import java.util.List;

@RestController
public class CountryRestController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/api/v1/countries")
    public ResponseEntity getAllCountries(){
        try{
            List<CountryEntitie> countries = countryService.getAllCountries();
            return ResponseEntity.ok(new RestResponse(true, "OK", countries));
        }catch (Exception exception){
            return ResponseEntity.badRequest().body(new RestResponse(false, exception.getMessage(), null));
        }
    }
}
