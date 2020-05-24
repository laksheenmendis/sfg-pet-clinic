package cresclux.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by laksheenmendis on 5/24/20 at 5:04 PM
 */

@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index", "vets/index.html"})
    public String listVets()
    {
        // below string corresponds to the path to the thymeleaf template (i.e. index.html)
        // inside the templates folder
        return "vets/index";
    }
}
