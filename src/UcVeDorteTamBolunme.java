import java.util.*;

public class UcVeDorteTamBolunme {
    public static void main(String[] args) {
        int i;
        double sum = 0, count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int a = input.nextInt();

        for (i = 0; i < a; i++){
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }

        System.out.println("Ortalama: " + sum/count);


    }
}