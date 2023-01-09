import java.util.*;

public class Main {
    public static void main(String[] args) {

        takeArr();
    }

    public static void takeArr(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int[] list = new int[sc.nextInt()];

        int i = 0;
        while(i < list.length){
            System.out.print("Dizinin " + (i + 1) + ". elemanını giriniz: ");
            list[i] = sc.nextInt();
            i++;
        }

        findFrequency(list);
    }

    public static void findFrequency(int[] list){
        int count;
        for(int i = 0; i < list.length; i++){
            count = 0;
            if(list[i] == 2147483647)
                continue;
            for(int j = i + 1; j < list.length; j++){
                if(list[i] == list[j]) {
                    list[j] = 2147483647;
                    count++;
                }
            }
            System.out.println(list[i] + " sayısı " + (count + 1) + " defa tekrar etti");
        }
    }

}
