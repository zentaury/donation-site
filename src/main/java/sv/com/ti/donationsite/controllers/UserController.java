package sv.com.ti.donationsite.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import sv.com.ti.donationsite.config.PasswordEncoder;
import sv.com.ti.donationsite.domain.entities.CountryEntity;
import sv.com.ti.donationsite.domain.entities.RolEntity;
import sv.com.ti.donationsite.domain.entities.UserEntity;
import sv.com.ti.donationsite.domain.services.CountryService;
import sv.com.ti.donationsite.domain.services.RolService;
import sv.com.ti.donationsite.domain.services.UserService;

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

    @GetMapping("/user/registration")
    public String registration(UserEntity user, Model model){
        List<CountryEntity> countries = countryService.getAllCountries();
        model.addAttribute("countries", countries);
        return "registration";
    }

    @PostMapping("/user/registration")
    public String create(UserEntity userEntity, Model model){

        userEntity.setPassword(passwordEncoder.passwordEncypt(userEntity.getPassword()));

        RolEntity rol = new RolEntity();

        userService.saveUser(userEntity);
        rol.setUserId(userEntity.getUserId());
        rol.setName("ROLE_USER");
        rolService.saveRol(rol);
        return "redirect:/";
    }
}
