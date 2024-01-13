package edu.fra.uas.feastfiesta.repository;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import edu.fra.uas.feastfiesta.model.Recipe;

@Repository
public class RecipeRepository extends HashMap<Long, Recipe>{

}
