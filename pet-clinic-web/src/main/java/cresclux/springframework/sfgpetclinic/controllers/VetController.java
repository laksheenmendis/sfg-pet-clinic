package cresclux.springframework.sfgpetclinic.controllers;

import cresclux.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by laksheenmendis on 5/24/20 at 5:04 PM
 */

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html", "/vets.html"})
    public String listVets(Model model)
    {
        model.addAttribute("vets", vetService.findAll());

        // below string corresponds to the path to the thymeleaf template (i.e. index.html)
        // inside the templates folder
        return "vets/index";
    }
}
