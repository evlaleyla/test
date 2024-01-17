package edu.fra.uas.feastfiesta.model;

import java.io.Serializable;

import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Recipe implements Serializable{

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(Recipe.class);

    private String name,description, category;
    private int numPerson, likes;
    private long id;
    private double preperationTime;
    private List<String> ingridients;
    //private User user;    welcher user hochgeladen hat

    public Recipe(){
        log.debug("Recipe created without values");
    }

    public Recipe(long id, String name, String description, String category, int numPerson, double preprationTime){
        log.debug("Recipe created with values + id: " + id + ", name: " + name + ", description: " + ", categroy: " + category + ", numPerson: " + numPerson + ", preperation time: " + preperationTime);
        this.id = id;
        this.category = category;
        this.description = description;
        this.name = name;
        this.numPerson = numPerson;
        this.preperationTime = preprationTime;
        this.ingridients = new ArrayList<>();
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getNumPerson() {
        return this.numPerson;
    }

    public void setNumPerson(int numPerson) {
        this.numPerson = numPerson;
    }

    public int getLikes() {
        return this.likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPreperationTime() {
        return this.preperationTime;
    }

    public void setPreperationTime(double preperationTime) {
        this.preperationTime = preperationTime;
    }
   
    public List<String> getIngridients(){
        return ingridients;
    }



    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Recipe)) {
            return false;
        }
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name) && Objects.equals(description, recipe.description) && Objects.equals(category, recipe.category) && numPerson == recipe.numPerson && likes == recipe.likes && id == recipe.id && preperationTime == recipe.preperationTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, category, numPerson, likes, id, preperationTime);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            ", category='" + getCategory() + "'" +
            ", numPerson='" + getNumPerson() + "'" +
            ", likes='" + getLikes() + "'" +
            ", id='" + getId() + "'" +
            ", preperationTime='" + getPreperationTime() + "'" +
            ", ingridients='" + getIngridients() + "'" +
            "}";
    }

}
