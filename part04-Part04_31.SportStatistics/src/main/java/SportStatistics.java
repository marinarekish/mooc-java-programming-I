
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine();

        int gamesPlayed = 0;
        int wins = 0;
//        int losses = 0;
        
        try (Scanner fileScan = new Scanner(Paths.get(file))) {
            while (fileScan.hasNextLine()) {
                String match = fileScan.nextLine();
                String[] matchInfo = match.split(",");
                
                String homeTeam = matchInfo[0];
                String visitTeam = matchInfo[1];
                int homePoints = Integer.valueOf(matchInfo[2]);
                int visitPoints = Integer.valueOf(matchInfo[3]);
                
                boolean homeWin = false;
                
                if (homePoints > visitPoints) {
                    homeWin = true;
                }

                if (homeTeam.equals(team) || visitTeam.equals(team)) {
                    gamesPlayed++;
                }
                
                if (homeWin && homeTeam.equals(team) || !homeWin && visitTeam.equals(team)) {
                    wins++;
//                } else if (!homeWin && homeTeam.equals(team) || homeWin && homeTeam.equals(team)) {
//                    losses++;
//                }
                }

            }
            
        } catch (Exception e) {
            System.out.println("Error!");
        }
        
        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
//        System.out.println("Losses: " + losses);        
        System.out.println("Losses: " + (gamesPlayed - wins));

    }

}
