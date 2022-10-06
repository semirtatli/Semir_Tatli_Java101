import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Kac KM gidildigini giriniz: ");
        int km = input.nextInt();
        double ucret = 10 + km*2.20;
        ucret = ucret >= 20 ? ucret: 20;
        System.out.println("Ucret: " + ucret);

    }
}
