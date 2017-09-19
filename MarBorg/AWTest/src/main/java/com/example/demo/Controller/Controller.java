package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class Controller {

    @GetMapping("/")
    public ModelAndView indexTest() {
        return new ModelAndView("index");
    }
}
