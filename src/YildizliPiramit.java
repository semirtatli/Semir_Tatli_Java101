import java.util.*;

public class YildizliPiramit {
    public static void main(String[] args) {
        int number, i , j, length;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        number = input.nextInt();

        length = number*2 - 1;
        for(i = 0; i < number*2; i++){
            if(i < number){
            for (j = 0; j < length; j++) {
                if(j <= (number-1) + i && j >= (number-1) - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }}
            else
                for (j = 0; j < length; j++) {
                    if(j <= ((number-1)*3-i) && j >= (i -number +1) )
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            System.out.print("\n");
        }



    }
}