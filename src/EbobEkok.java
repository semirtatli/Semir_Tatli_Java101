import java.util.*;

public class EbobEkok {
    public static void main(String[] args) {
        int i, number1, number2, ebob = 1, ekok;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        number1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        number2 = input.nextInt();

        i = number1;

        while( i >=1){

            if(number1 % i == 0 && number2 % i == 0){
                ebob = i;
                break;
            }
            i--;
        }

        ekok = (number1 * number2) / ebob;

        System.out.println("ebob: " + ebob + "\nekok: " + ekok);



    }
}