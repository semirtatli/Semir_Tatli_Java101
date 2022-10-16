import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length, i, number1 = 0, number2 = 1;
        System.out.print("Fibonacci serisinin istediğiniz uzunluğunu giriniz: ");
        length = input.nextInt();

        for(i = 0; i < length; i++){

            if(i % 2 == 0) {
                System.out.print(number1 + " ");
                number1 += number2;
            }
            else {
                System.out.print(number2 + " ");
                number2 += number1;
            }

        }


    }
}