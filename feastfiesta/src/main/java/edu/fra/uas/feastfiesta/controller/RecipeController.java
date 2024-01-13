package edu.fra.uas.feastfiesta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class RecipeController {

    @RequestMapping(value = "hello", method=RequestMethod.GET)
    @ResponseBody
    public String getHelloWorld() {
        return "<h1>Hello World Spring Boot!</h1>";
    }
    
}
