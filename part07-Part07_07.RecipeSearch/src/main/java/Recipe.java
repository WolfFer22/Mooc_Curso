
import java.util.ArrayList;

public class Recipe {
    
    private String name;
    private int recipeDuration;
    private ArrayList<String> ingredients;

    Recipe(String name, int recipeDuration, ArrayList<String> ingredient) {
        this.name = name;
        this.recipeDuration = recipeDuration;
        this.ingredients = ingredient;
    }
    
    public void addIngredients(String ingredient){
        this.ingredients.add(ingredient);
    }
    
    public String getName() {
        return name;
    }

    public int getRecipeDuration() {
        return recipeDuration;
    }
    
    public ArrayList<String> getIngredients() {
        return ingredients;
    }    

    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.recipeDuration;
    }    

}
