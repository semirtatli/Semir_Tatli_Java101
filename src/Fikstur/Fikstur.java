import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList clubs = new ArrayList<>();
        clubs.add("Real Madrid");
        clubs.add("Arsenal");
        clubs.add("Manchester City");
        clubs.add("Juventus");
        clubs.add("Bayern Munih");
        clubs.add("Milan");
        //clubs.add("Borussia Dortmund");
        //clubs.add("Liverpool");

        if(clubs.size() % 2 != 0)
            clubs.add("Bay");

        int club_number = clubs.size();
        int round = (club_number-1)*2;

        Collections.shuffle(clubs);

        int[][] matches = new int[round][club_number];

        create_First_Round(club_number, round, matches);
        create_Second_Round(club_number, round, matches);

        print_Fikstur(clubs, matches, round);
    }

    private static void print_Fikstur(ArrayList clubs, int[][] matches, int round) {
        for(int i = 0; i < round; i++){
            System.out.println("Round " + (i+1));
            for(int j = 0; j < clubs.size();j++){
                if(j % 2 != 0) {
                    System.out.print(clubs.get(matches[i][j]) + "\n");
                }else
                    System.out.print(clubs.get(matches[i][j]) + " - ");


            }
            System.out.println();
        }
    }

    private static int[][] create_Second_Round(int club_number, int round, int[][] matches) {
        for(int i = 0; i < club_number; i++){
            if(i %2 == 0)
                matches[round/2][i] = matches[0][i + 1];
            else
                matches[round/2][i] = matches[0][i - 1];
        }
        for(int j = round/2 + 1; j < round;j++) {
            for(int i = 0; i < club_number;i++) {

                if (i % 2 == 0) {

                    if (i == club_number - 2)
                        matches[j][club_number-1] = matches[j - 1][i];
                    else
                        matches[j][i +2] = matches[j - 1][i];
                }
                if (i % 2 != 0) {
                    if(i == 1)
                        matches[j][i] = matches[j - 1][i];
                    else if (i != 3)
                        matches[j][i - 2] = matches[j - 1][i];
                    else
                        matches[j][i -3] = matches[j - 1][i];
                }
            }
        }

        return matches;
    }

    private static int[][] create_First_Round(int club_number, int round, int[][] matches) {
        for(int i = 0; i < club_number; i++){
            matches[0][i] = i;
        }
        for(int j = 1; j < round/2;j++) {
        for(int i = 0; i < club_number;i++) {

            if (i % 2 == 0) {
                    if(i == 0)
                        matches[j][i] = matches[j - 1][i];
                    if (i == club_number - 2)
                        matches[j][club_number-1] = matches[j - 1][i];
                    else
                        matches[j][i +2] = matches[j - 1][i];
            }
            if (i % 2 != 0) {
                if (i != 1)
                    matches[j][i - 2] = matches[j - 1][i];
                else
                    matches[j][i + 1] = matches[j - 1][i];
            }
        }
        }

        return matches;
    }

  /*  public static void matches(ArrayList clubs, boolean[][] matches_against, int[] home_matches){

        int club_number = clubs.size();

        boolean[] roundPlayed = new boolean[club_number];

        for(int i = 0; i< (club_number-1) * 2; i++){

            for(int k = 0; k < roundPlayed.length; k++){
                roundPlayed[k] = false;
            }

            System.out.println("\n\nRound " + (i+1) + "\n");
            for(int j= 0; j < club_number /2; j++){

                int home = findHomeClub(clubs, matches_against, home_matches, club_number, roundPlayed);
                findAwayClub(clubs, matches_against, club_number, home, roundPlayed);
            }
        }
    }

    public static boolean possibleOpponentExist(boolean[][] matches_against, int club_number, boolean[] roundPlayed, int rand){
        for(int n = 0; n < club_number; n++){
            if(!matches_against[rand][n] && !roundPlayed[n])
                return true;
        }
        return false;
    }

    public static int findHomeClub(ArrayList clubs, boolean[][] matches_against, int[] home_matches, int club_number, boolean[] roundPlayed){
        int rand;
boolean noPossibleOpponent = true;
        rand = (int)(Math.random() * club_number);
        if(possibleOpponentExist(matches_against, club_number, roundPlayed,rand)){
           noPossibleOpponent = false;
        }
        while(home_matches[rand] >= club_number - 1 || roundPlayed[rand] || noPossibleOpponent){
            //System.out.println("It's in a loop");
            noPossibleOpponent= true;
            rand = (int)(Math.random() * club_number);
            if(possibleOpponentExist(matches_against, club_number, roundPlayed,rand)){
                noPossibleOpponent = false;
            }
        }
            home_matches[rand]++;
            roundPlayed[rand] = true;
        System.out.print(clubs.get(rand) + " - ");
        return rand;
    }

    public static void findAwayClub(ArrayList clubs, boolean[][] matches_against, int club_number, int home, boolean[] roundPlayed){
        int rand;
        //System.out.println("It's in a loop");
        rand = (int)(Math.random() * club_number);
        while(matches_against[home][rand] || roundPlayed[rand]){
            rand = (int)(Math.random() * club_number);
        }
        roundPlayed[rand] = true;
        matches_against[home][rand] = true;
        System.out.println(clubs.get(rand));
    }*/
}