import java.util.*;

public class UsAlma {
    public static void main(String[] args) {
        int i, n, k, number = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        n = input.nextInt();
        System.out.print("Üs olacak sayıyı giriniz: ");
        k = input.nextInt();

        for (i = 1 ; i <= k; i++){

            number *= n;

        }

        System.out.println("Sonuç: " + number);

    }
}