import java.util.*;

public class CinZodyak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil, circle;
        String zodyak = "";
        System.out.print("Doğum yılınızı giriniz: ");
        yil = input.nextInt();

        circle = yil % 12;

        switch (circle) {

            case 0:
                zodyak = "Maymun";
                break;
            case 1:
                zodyak = "Horoz";
                break;
            case 2:
                zodyak = "Köpek";
                break;
            case 3:
                zodyak = "Domuz";
                break;
            case 4:
                zodyak = "Fare";
                break;
            case 5:
                zodyak = "Öküz";
                break;
            case 6:
                zodyak = "Kaplan";
                break;
            case 7:
                zodyak = "Tavşan";
                break;
            case 8:
                zodyak = "Ejderha";
                break;
            case 9:
                zodyak = "Yılan";
                break;
            case 10:
                zodyak = "At";
                break;
            case 11:
                zodyak = "Koyun";
                break;
            default:
                System.out.println("yanlış yıl girdiniz");
        }

        System.out.println("Çin Zodyak Burcunuz: " + zodyak);

    }
}