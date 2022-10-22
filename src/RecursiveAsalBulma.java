import java.util.*;

public class RecursiveAsalBulma {

    static boolean prime(int number, int num){

        if(number < 2)
            return false;
        if(number == 2)
            return true;
        if(number % num == 0)
            return false;
        if(num * num > number)
            return true;


        return prime(number,num+1);


    }



    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Asal olup olmadığını kontrol etmek istediğiniz sayıyı giriniz: ");
        number = input.nextInt();

        if(prime(number, 2))
            System.out.println("Bu bir asal sayıdır");
        else
            System.out.println("Bu bir asal sayı değildir");





    }
}