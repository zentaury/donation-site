package sv.com.ti.donationsite.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sv.com.ti.donationsite.domain.entities.DonationEntitie;
import sv.com.ti.donationsite.domain.entities.UserEntitie;
import sv.com.ti.donationsite.domain.services.DonationService;
import sv.com.ti.donationsite.domain.services.UserService;

@Controller
@Slf4j
public class DonationController {

    @Autowired
    private DonationService donationService;

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index(Model model, @AuthenticationPrincipal User user, UserEntitie userEntitie){
       /* var userFinded = userService.findUser(2L);*/
        Iterable<DonationEntitie> donatios = donationService.findAllByUser(2L);
        model.addAttribute("donations", donatios);
        return "index";
    }
}
