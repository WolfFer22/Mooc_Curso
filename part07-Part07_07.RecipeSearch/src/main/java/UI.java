
import java.util.ArrayList;
import java.util.Scanner;


public class UI {
    private RecipeBook recipeList;
    private Scanner scan;

    public UI(RecipeBook recipeList, Scanner scanner) {
        this.recipeList = recipeList;
        this.scan = scanner;
    }
    public void start(){
        while(true){
            System.out.println("Commands:\n" +
                "list - lists the recipes\n" +
                "stop - stops the program\n" +
                "find name - searches recipes by name\n" +
                "find cooking time - searches recipes by cooking time\n" +
                "find ingredient - searches recipes by ingredient");
            
            String inputCommand = scan.nextLine();
            
            if (inputCommand.equals("stop")){
                break;
            }
            
            else if (inputCommand.equals("list")){                
                System.out.println("Recipes:");
                recipeList.printRecipeBook();
                
            }  
            
            else if (inputCommand.equals("find name")){                
                System.out.println("Searched word: ");
                String recipeName = scan.nextLine();
                
                recipeList.searchByName(recipeName);     
                
            } 
            
            else if (inputCommand.equals("find cooking time")){                
                System.out.println("Max cooking time: ");
                String recipeTime = scan.nextLine();
                
                recipeList.searchByTime(recipeTime);      
            } 
            
            else if (inputCommand.equals("find ingredient")){                
                System.out.println("Ingredient: ");
                String recipeIngredient = scan.nextLine();
                
                recipeList.searchByIngredients(recipeIngredient);      
            } 
            
            else{
                System.out.println("Unknown command"); 
            }
                       
        }
    }
}
