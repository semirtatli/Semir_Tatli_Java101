import java.util.*;

public class MukemmelSayi {
    public static void main(String[] args) {
        int number, i , sum;
        Scanner input = new Scanner(System.in);

        number = 1;

        while( number != 0){
            sum = 0;
            System.out.print("Lütfen sayıyı giriniz(Çıkmak için 0 giriniz): ");
            number = input.nextInt();
            for( i = 1; i < number; i++){
                if(number % i == 0)
                    sum += i;
            }
            if (number == sum)
                System.out.println(number + " bir mükemmel sayıdır\n");
            else
                System.out.println(number + " bir mükemmel sayı değildir\n");
        }



    }
}