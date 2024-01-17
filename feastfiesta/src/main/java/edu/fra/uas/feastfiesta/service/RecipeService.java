package edu.fra.uas.feastfiesta.service;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fra.uas.feastfiesta.model.Recipe;
import edu.fra.uas.feastfiesta.repository.RecipeRepository;

@Service
public class RecipeService {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(RecipeService.class);

    @Autowired
    RecipeRepository recipeRepository;

    private long nextRecipeId = 1;

    public Recipe createRecipe(Recipe recipe) {
        log.debug("createRecipe: " + recipe);
        recipe.setId(nextRecipeId++);
        recipeRepository.put(recipe.getId(), recipe);
        return recipe;
    }

    public Iterable<Recipe> getAllRecipes(){
        log.debug("getAllRecipes");
        return recipeRepository.values();
    }

    public Recipe updateRecipe(Recipe recipe){    //nur von User
        log.debug("upateRecipe: " + recipe);
        recipeRepository.put(recipe.getId(), recipe);
        return recipe;
    }

    public void deleteRecipe(long id){  //nur von user
        log.debug("deleteRecipe: " + id);
        recipeRepository.remove(id);
    }

    public void likeRecipe(){    //hier oder im user?

    }
}
