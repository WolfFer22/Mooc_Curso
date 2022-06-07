
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RecipeBook recipeList = new RecipeBook();
        
        System.out.println("File to read: ");
        String fileName = scanner.nextLine();

        try (Scanner scan = new Scanner(Paths.get(fileName))) {
            
            ArrayList<String> fileLines = new ArrayList<>();
            
            while (scan.hasNextLine()) {
                
                String line = scan.nextLine();
                
                if (line.trim().isEmpty() || !scan.hasNextLine()) {
                    
                    String name = fileLines.get(0);
                    int timePreparation = Integer.valueOf(fileLines.get(1));
                    
                    ArrayList<String> ingredients = new ArrayList<>();
                    
                    for(int i = 2; i < fileLines.size(); i++){
                        ingredients.add(fileLines.get(i));
                    }
                    
                    recipeList.addRecipe(new Recipe(name, timePreparation, ingredients));
                    
                    fileLines.removeAll(fileLines);
                    
                } else{
                    fileLines.add(line);
                }                
 
            }
            
            scan.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        UI ui = new UI(recipeList, scanner);
        ui.start();

    }

}
