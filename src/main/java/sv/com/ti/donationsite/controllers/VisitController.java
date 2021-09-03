package sv.com.ti.donationsite.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sv.com.ti.donationsite.domain.entities.VisitEntity;
import sv.com.ti.donationsite.domain.services.VisitService;

import java.util.Date;

@Controller
@Slf4j
public class VisitController {

    @Autowired
    private VisitService visitService;

    @GetMapping("/login")
    public void createVisit(Model model, VisitEntity visit){
        visit.setDate(new Date());
        visitService.saveVisit(visit);
    }
}
