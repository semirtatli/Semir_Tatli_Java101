import java.util.*;

public class SayininBasamaklariniToplama {
    public static void main(String[] args) {
        int tempNumber, number, digit, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        number = input.nextInt();

        tempNumber = number;
        while (tempNumber != 0){
            digit = tempNumber % 10;
            tempNumber /= 10;
            sum += digit;
        }

        System.out.println("Girilen sayının basamakları toplamı: " + sum);

    }
}