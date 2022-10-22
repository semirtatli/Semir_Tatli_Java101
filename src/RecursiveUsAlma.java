import java.util.*;

public class RecursiveUsAlma {

    static int pow(int base, int power){

        if (power == 1)
            return base;
        return base * pow(base,power-1);

    }



    public static void main(String[] args) {
        int base,power;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        base = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        power = input.nextInt();

        System.out.println(pow(base, power));


    }
}