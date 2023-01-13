import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = (int)(Math.random() * 100);
        int right = 0;
        boolean isWin = false;
        int guess;


        while(right < 5) {

            System.out.print("Lütfen 0 ila 100 arasında bir tahmin giriniz: ");
            guess = sc.nextInt();

            if (guess < 0 || guess > 100) {
                System.out.println("Lütfen 0 ile 100 arasında bir sayı giriniz: ");
                right++;
                System.out.println("Kalan hakkınız: " + (5 - right));
                continue;
            }

            right++;

            if (guess == number) {
                isWin = true;
                break;
            } else if (guess < number) {
                System.out.println("Tahmininiz sayıdan daha küçük");
            System.out.println("Son girdiğiniz sayı: " + guess);
            System.out.println("Kalan hakkınız: " + (5 - right));
            }
            else {
                System.out.println("Tahmininiz sayıdan daha büyük");
                System.out.println("Son girdiğiniz sayı: " + guess);
                System.out.println("Kalan hakkınız: " + (5 - right));
            }

        }

        if(isWin){
            System.out.println("Tebrikler, " + number + " sayısını buldunuz");
        }

    }
}
