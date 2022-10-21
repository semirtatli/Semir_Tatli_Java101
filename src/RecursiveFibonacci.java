import java.util.*;

public class RecursiveFibonacci {

    static int fibonacci(int number){

        if(number == 1 || number == 2)
            return 1;
        else
            return fibonacci(number-1) + fibonacci(number-2);


    }

    public static void main(String[] args) {
        int number, result;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        number = input.nextInt();

        result = fibonacci(number);

        System.out.println(result);

    }
}