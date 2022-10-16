import java.util.*;

public class TersUcgen {
    public static void main(String[] args) {
        int size, i, j;
        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin boyutunu giriniz: ");
        size = input.nextInt();

        for(i = 0; i < size;i++){
            for (j = 0; j < 2 * size -1; j++){
                if(j >= i && j <= 2*size-2-i)
                    System.out.print("*");
                else
                    System.out.print(" ");


            }
            System.out.print("\n");
        }



    }
}