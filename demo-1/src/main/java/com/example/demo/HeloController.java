package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HeloController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("message", "Hello Springboot!!!!SSSSSS");
        
        String helloMessage = "‚±‚ñ‚É‚¿‚Í";
        model.addAttribute("helloMessage", helloMessage);

        Member member = new Member(1, "ˆê˜Y");
        model.addAttribute("member", member);
        
        System.out.print(model.toString());
        return "index";
    }
}
