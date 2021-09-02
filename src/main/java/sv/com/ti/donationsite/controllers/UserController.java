package sv.com.ti.donationsite.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sv.com.ti.donationsite.domain.entities.UserEntitie;
import sv.com.ti.donationsite.domain.services.UserService;

@Controller
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index(Model model){
        Iterable<UserEntitie> users= userService.getAllUsers();
        log.info("Ejecutando el controlador index de UserController");
        model.addAttribute("users", users);
        return "index";
    }
}
