import java.util.*;

public class HarmonikSeri {
    public static void main(String[] args) {
        int i, number;
        double sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Harmonik serisi hesaplanacak sayıyı giriniz: ");
        number = input.nextInt();

        for(i = 1; i <=number; i++){
            sum += (1.0/i);

        }

        System.out.println("Harmonik seri sonucu: " + sum);
    }
}