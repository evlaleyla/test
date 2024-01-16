package edu.fra.uas.feastfiesta.config;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.fra.uas.feastfiesta.model.Recipe;
import edu.fra.uas.feastfiesta.service.RecipeService;
import jakarta.annotation.PostConstruct;

@Component
public class InitDataRecipes {

    private final Logger log = org.slf4j.LoggerFactory.getLogger(InitDataRecipes.class);

    @Autowired
    RecipeService recipeService;

    @PostConstruct
    public void init(){
        log.debug("### Initialize Data ###");

        log.debug("create recipe spaghetti");
        Recipe recipe = new Recipe();
        recipe.setCategory("nudeln");
        recipe.setDescription("Wasser kochen, nudeln in wasser");
        recipe.setName("Spaghetti");
        recipe.setNumPerson(2);
        recipe.setPreperationTime(20);
    }
}
