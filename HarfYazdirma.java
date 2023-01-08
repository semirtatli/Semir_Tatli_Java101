import java.util.*;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
//    System.out.print("Harfin dikey büyüklüğünü giriniz: ");
//    int vertic = sc.nextInt();
//    System.out.print("Harfin yatay büyüklüğünü giriniz: ");
//    int  horizon = sc.nextInt();

        int vertic = 9;
        int horizon = 6;

    for(int i = 0; i < vertic; i++){
        for(int j = 0; j < horizon; j++){
            if((i == 0) || i == vertic-1 || j == 0 || j == horizon - 1)
                System.out.print("*");
            else if (i == vertic / 2)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
    }

    }
}
