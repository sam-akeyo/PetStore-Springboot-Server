package io.configuration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String index() {
        System.out.println("ui.html");
        return "redirect:ui.html";
    }
}
