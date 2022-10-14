import java.util.*;

public class DortunKatlariniToplama {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);


        int a = 0;
        while(a % 2 == 0) {
            if(a % 4 == 0)
            sum += a;

            System.out.print("Sayıyı giriniz: ");
            a = input.nextInt();
        }

        System.out.println("Toplam: " + sum);

    }
}