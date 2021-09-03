package sv.com.ti.donationsite.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import sv.com.ti.donationsite.config.PasswordEncoder;
import sv.com.ti.donationsite.domain.entities.CountryEntitie;
import sv.com.ti.donationsite.domain.entities.RolEntitie;
import sv.com.ti.donationsite.domain.entities.UserEntitie;
import sv.com.ti.donationsite.domain.services.CountryService;
import sv.com.ti.donationsite.domain.services.RolService;
import sv.com.ti.donationsite.domain.services.UserService;

import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RolService rolService;

    @Autowired
    private CountryService countryService;

    private PasswordEncoder passwordEncoder;

    @GetMapping("/")
    public String index(Model model, @AuthenticationPrincipal User user){
        Iterable<UserEntitie> users= userService.getAllUser();
        log.info("Ejecutando el controlador index de UserController");
        log.info("Actual user:" + user);
        model.addAttribute("users", users);
        return "index";
    }

    @GetMapping("/user/registration")
    public String registration(UserEntitie user, Model model){
        List<CountryEntitie> countries = countryService.getAllCountries();
        model.addAttribute("countries", countries);
        return "registration";
    }

    @PostMapping("/user/registration")
    public String create(UserEntitie userEntitie, Model model){

        userEntitie.setPassword(passwordEncoder.passwordEncypt(userEntitie.getPassword()));

        RolEntitie rol = new RolEntitie();

        userService.saveUser(userEntitie);
        rol.setUserId(userEntitie.getUserId());
        rol.setName("ROLE_USER");
        rolService.saveRol(rol);
        return "redirect:/";
    }
}
