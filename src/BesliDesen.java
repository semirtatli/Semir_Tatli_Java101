import java.util.*;

public class BesliDesen {

    static void pattern(int number, int num, boolean isDecreasing){


        if(isDecreasing) {
            System.out.print(num + " ");
            num -= 5;
            if (num <= 0) {
                isDecreasing = false;
            }
            pattern(number, num, isDecreasing);
        } else {

            System.out.print(num + " ");
            num += 5;
            if (num == number){
                System.out.print(number + " ");
            } else
                pattern(number, num, isDecreasing);

        }


    }


    public static void main(String[] args) {
        int number, num;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        number = input.nextInt();
        num = number;
        System.out.println("N sayısı: " + number);
        System.out.print("Seri: ");
        pattern(number,num,true);


    }
}