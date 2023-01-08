import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int number = sc.nextInt();
        int[] list = {15,12,788,1,-1,-778,2,0};

        int min = list[0];
        int max = list[0];



        for (int i = 0; i < list.length; i++) {
            if(list[i] > max)
                max = list[i];
            if(list[i] < min)
                min = list[i];


        }

        int minNum = min;
        int maxNum = max;

        for (int i = 0; i < list.length; i++) {
            if (list[i] < number && (number - minNum > number - list[i]))
                minNum = list[i];

            if (list[i] > number && (maxNum - number > list[i] - number))
                maxNum = list[i];
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);

        System.out.println("Girilen Sayıya Yakın En Küçük Değer " + minNum);
        System.out.println("Girilen Sayıya Yakın En Büyük Değer " + maxNum);


    }
}
