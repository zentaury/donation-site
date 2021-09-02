package sv.com.ti.donationsite.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sv.com.ti.donationsite.domain.entities.UserEntitie;
import sv.com.ti.donationsite.repositories.UserRepository;

import java.util.List;

@Controller
@Slf4j
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String index(Model model){
        Iterable<UserEntitie> users= userRepository.findAll();
        log.info("Ejecutando el controlador index de UserController");
        model.addAttribute("users", users);
        return "index";
    }
}
