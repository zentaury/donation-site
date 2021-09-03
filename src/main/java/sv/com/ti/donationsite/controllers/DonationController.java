package sv.com.ti.donationsite.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import sv.com.ti.donationsite.domain.DTOs.donation.DonationForm;
import sv.com.ti.donationsite.domain.entities.CountryEntity;
import sv.com.ti.donationsite.domain.entities.DonationEntity;
import sv.com.ti.donationsite.domain.entities.TransactionEntity;
import sv.com.ti.donationsite.domain.entities.UserEntity;
import sv.com.ti.donationsite.domain.services.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@Slf4j
public class DonationController {

    @Autowired
    private DonationService donationService;

    @Autowired
    private UserService userService;

    @Autowired
    private CountryService countryService;

    @Autowired
    private TransactionService transactionService;

    @Autowired
    private VisitService visitService;

    @GetMapping("/")
    public String index(Model model, @AuthenticationPrincipal User user, UserEntity userEntitie){

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username = ((UserDetails)principal).getUsername();
        UserEntity userEntity = userService.getUserEntityByUsername(username);
        Iterable<DonationEntity> donatios = donationService.findAllByUser(userEntity.getUserId());
        int visitsPerDay = visitService.visitsPerDay(new Date());
        Long allVisits = visitService.allVisits();
        model.addAttribute("allVisits", allVisits);
        model.addAttribute("visitsPerDay", visitsPerDay);
        model.addAttribute("donations", donatios);
        return "index";
    }

    @GetMapping("/donation")
    public String donation(Model model, @AuthenticationPrincipal User user, UserEntity userEntitie){

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        String username = ((UserDetails)principal).getUsername();

        UserEntity userEntity = userService.getUserEntityByUsername(username);

        List<CountryEntity> countries = countryService.getAllCountries();

        model.addAttribute("userName", userEntity.getName());
        model.addAttribute("userSurname",  userEntity.getSurnames());
        model.addAttribute("userInstitution", userEntity.getInstitution());

        model.addAttribute("userCountryId", userEntity.getCountryId());
        model.addAttribute("countryList", countries);

        return "donation";
    }

    @PostMapping(value="/donation/processDonation",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String donationCreated(Model model, @ModelAttribute DonationForm donationForm ){
        //Logica de la donacion
        UUID uuid= UUID.randomUUID();

        transactionService.saveTransaction(donationForm.getCardOwner(),uuid.toString());
        TransactionEntity transaction = transactionService.getTransactionIdByCardOwnerAndBankIssueId(donationForm.getCardOwner(),uuid.toString());
        DonationEntity donation = new DonationEntity();


        int donationCount = donationService.donationCount(donationForm.getCountryId(), new Date(), new Date());

        if (donationCount > 0){
            return "donationFailed";
        }

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username = ((UserDetails)principal).getUsername();
        UserEntity userEntity = userService.getUserEntityByUsername(username);
        donation.setUserId(userEntity.getUserId());
        donation.setTransactionId(transaction.getTransactionId());
        donation.setCountryId(donationForm.getCountryId());
        donation.setInstitution(donationForm.getInstitution());
        donation.setAmount(donationForm.getAmount());
        donation.setDate( new Date());
        donationService.saveDonation(donation);

        return "donationSuccess";
    }
}
