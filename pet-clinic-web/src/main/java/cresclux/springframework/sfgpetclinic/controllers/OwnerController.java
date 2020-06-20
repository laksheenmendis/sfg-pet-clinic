package cresclux.springframework.sfgpetclinic.controllers;

import cresclux.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by laksheenmendis on 5/24/20 at 5:11 PM
 */

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(Model model)
    {
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }

    @RequestMapping({"/find"})
    public String findOwners()
    {
        return "notimplemented";
    }
}
