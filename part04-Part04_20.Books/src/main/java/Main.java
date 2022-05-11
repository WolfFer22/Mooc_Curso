import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<BookInformation> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            
            System.out.println("Title: ");
            String title = scanner.nextLine();
            
            if(title.isEmpty()){
                break;
            }
            
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());            
            
            books.add( new BookInformation(title, pages, year));
            
        }
        
        System.out.println("What information will be printed?");
        String whatToPrint = scanner.nextLine();
        
        if (whatToPrint.equals("everything")){
            for (BookInformation ibook: books){
                System.out.println(ibook.getBookTitle() + ", " + ibook.getPages() + " pages" + ", " + ibook.getYear());
            }
        } else if(whatToPrint.equals("name")){
            for (BookInformation ibook: books){
                System.out.println(ibook.getBookTitle());
            }
        }        
        
    }
    
}
