import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int size = sc.nextInt();
        int[] list = new int[size];
        int value;
        int i = 0;

        while (i < size) {
            System.out.print("Dizinin " + (i+1) + ". elemanını giriniz: ");
            value = sc.nextInt();
            list[i] = value;
            i++;
        }

        int temp;
        int min = 0;

        for(i = 0; i < size; i++){
            for(int j = i; j < size; j++){
                if(list[j] < list[min])
                    min = j;
            }

            temp = list[i];
            list[i] = list[min];
            list[min] = temp;
        }

        for(i = 0; i < size; i++){
            System.out.print(list[i] + " ");
        }

    }
}
