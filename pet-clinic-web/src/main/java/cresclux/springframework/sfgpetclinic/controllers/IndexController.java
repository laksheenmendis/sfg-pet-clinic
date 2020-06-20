package cresclux.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by laksheenmendis on 5/24/20 at 4:42 PM
 */
@Controller
public class IndexController {

    // below is a mapping for multiple requests
    // Eg; localhost:9090, localhost:9090/, localhost:9090/index, localhost:9090/index.html
    @RequestMapping({"", "/", "index", "index.html"})
    public String index()
    {
        return "index";
    }

    @RequestMapping({"/oups"})
    public String oupsHandler()
    {
        return "notimplemented";
    }
}
