import java.util.*;

public class MinMax {
    public static void main(String[] args) {
        int girilecekSayi, i, min = 0, max = 0, number;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kaç sayı gireceğinizi yazınız: ");
        girilecekSayi = input.nextInt();

        for (i = 0; i < girilecekSayi; i++) {
            System.out.print(i+1 + ". sayıyı giriniz:");
            number = input.nextInt();
            if (i == 0) {
                min = number;
                max = number;
            } else {
                if (number > max)
                    max = number;
                if (number < min)
                    min = number;
            }
        }
        System.out.println("Min: " + min + "\nMax: " + max);



    }
}
