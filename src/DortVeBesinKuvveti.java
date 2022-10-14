import java.util.*;

public class DortVeBesinKuvveti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int a = input.nextInt();


        for (int i = 1; i < a; i*=4){
            System.out.println(i);
        }

        for(int j = 1; j < a; j *= 5) {
            System.out.println(j);
        }


    }
}