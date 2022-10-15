
import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number, tempNumber, count = 0, digit, sum = 0, i;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        number = input.nextInt();
        tempNumber = number;

        while(tempNumber != 0 ){

            tempNumber /= 10;
            count++;
        }
        tempNumber = number;

        for (i = 0; i <count; i++){
            digit = tempNumber % 10;
            sum += Math.pow(digit, count);
            tempNumber /= 10;
        }

        if (sum == number)
            System.out.println(sum + " sayısı " + number + " sayısına eşittir");

        System.out.println(sum);
    }

}