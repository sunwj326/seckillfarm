package net.softwaregrp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomController {

    @RequestMapping("/")
    public String home(){
        return "Hello, Home";
    }
}
