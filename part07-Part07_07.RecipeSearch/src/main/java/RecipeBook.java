
import java.util.ArrayList;


class RecipeBook {
    private ArrayList<Recipe> recipes;

    public RecipeBook() {
        this.recipes = new ArrayList<>();
    }
    
    public void addRecipe(Recipe recipe){
        this.recipes.add(recipe);
    }

    public void printRecipeBook(){
        if (this.recipes.isEmpty()){
            System.out.println("Recipe Book is Empty");
            
        } else{    
            for (Recipe e : this.recipes) {
                System.out.println(e);
            }
        }
    }
    
    public void searchByName(String name){
        if (this.recipes.isEmpty()){
            System.out.println("Recipe not found!");
            
        } else {
            for (Recipe r : this.recipes){
                if (r.getName().contains(name)){
                    System.out.println(r);
                }
            }            
        }
        
    }
    
    public void searchByTime(String time){
        if (this.recipes.isEmpty()){
            System.out.println("Recipe not found!");
            
        } else {
            for (Recipe r : this.recipes){
                if (r.getRecipeDuration() <= Integer.valueOf(time)){
                    System.out.println(r);
                }
            }
        }   
    }
    
    public void searchByIngredients(String ingredient){
        if (this.recipes.isEmpty()){
            System.out.println("Recipe not found!");
            
        } else {
            for(Recipe r : this.recipes){
                if(r.getIngredients().contains(ingredient)){
                    System.out.println(r);
                }
            }
        }
    }
    
}
