
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        ArrayList <String> list = new ArrayList<>();
        
        System.out.println("File: ");
        String fileCSV = scan.nextLine();
        
        System.out.println("Team: ");
        String teameName = scan.nextLine();       
        
        try (Scanner scanner = new Scanner(Paths.get(fileCSV))){
            
            int gamesPlayed = 0;
            int homeWins = 0;
            int awayWins = 0;            
            
            while (scanner.hasNextLine()){
                String row = scanner.nextLine();
                
                String[] parts = row.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homeScore = Integer.valueOf(parts[2]);
                int awayScore = Integer.valueOf(parts[3]);                            
                
                if (teameName.equals(homeTeam) && (homeScore > awayScore)){                  
                    homeWins++;
                    gamesPlayed++;
                    
                } else if (teameName.equals(homeTeam)){
                    gamesPlayed++;
                }
                
                if (teameName.equals(awayTeam) && (awayScore > homeScore)){
                    awayWins++;
                    gamesPlayed++;  
                    
                } else if (teameName.equals(awayTeam)){
                    gamesPlayed++;
                }   
                
            }
            int wins = homeWins + awayWins;
            int losses = gamesPlayed - (homeWins + awayWins);
            
            System.out.println("Games: " + gamesPlayed);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
            
        } catch (Exception ex){
            System.out.println("Error");
        }

    }
}
