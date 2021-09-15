package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {

  @GetMapping("/greeting")
  public String greetingForm(Model model) {
	Greeting greeting = new Greeting();
	greeting.setId(19);
	greeting.setContent("guan");
    model.addAttribute("greeting", greeting);
    return "greeting";
  }

  @PostMapping("/greeting")
  public String greetingSubmit(@ModelAttribute @Validated Greeting greeting, BindingResult result, Model model) {
	 if (result.hasErrors()) {
          List<String> errorList = new ArrayList<String>();
          for (ObjectError error : result.getAllErrors()) {
              errorList.add(error.getDefaultMessage());
          }
          model.addAttribute("validationError", errorList);
          return "greeting";
      } else {
    	  model.addAttribute("hello", greeting);
      }
    return "result";
  }

}