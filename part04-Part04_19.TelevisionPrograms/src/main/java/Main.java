import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {  
            
            System.out.println("Name: ");
            String programName = scanner.nextLine();
            
            if(programName.isEmpty()){
                break;
            }
            
            System.out.println("Duration: ");
            int programDuration = Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(programName, programDuration));
            
        }
        
        System.out.println("Program's maximum duration?");
        
        int maxDuration = Integer.valueOf(scanner.nextLine());
        
//        for (int i = 0 ; i <= programs.size();i++) {  
//            
//            if (programs.get(i).getDuration() < maxDuration){
//                System.out.println(programs.get(i).getName() + "," + programs.get(i));                
//            }            
//        }
        
        for (TelevisionProgram iProgram: programs){
            if(iProgram.getDuration() <= maxDuration){
                System.out.println(iProgram.getName() + "," + iProgram.getDuration() + " minutes");
            }
        }
        
    }
}
