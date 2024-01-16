package edu.fra.uas.feastfiesta.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;

@Controller
public class RecipeController {
    
    Logger log = LoggerFactory.getLogger(RecipeController.class);

      @Autowired
   // private RecipeService recipeService;

    @RequestMapping
    public String get() {
        log.debug("get() is called");
        return "index.html";
    }
    
    
    }
  
