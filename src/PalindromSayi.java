import java.util.*;
public class PalindromSayi {

    static boolean isPalindrom(int number) {
        int tempNumber, firstDigit, lastDigit, count = 0;
        boolean isPolindrom = true;
        tempNumber = number;
        while ( tempNumber >= 1){
            tempNumber /= 10;
            count++;
        }

        tempNumber = number;
        while(count >= 2) {
            firstDigit = (int) (tempNumber / (Math.pow(10,count-1)));
            lastDigit = tempNumber%10;
            tempNumber -= firstDigit * (Math.pow(10,count-1));
            if( lastDigit != (firstDigit)){
                isPolindrom= false;
                break;
            }
            else
                count -=2;
            tempNumber /= 10;
        }
        return isPolindrom;
    }

    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        number = input.nextInt();


        if (isPalindrom(number))
            System.out.println(number + "Palindrom sayıdır");
        else
            System.out.println(number + "Palindrom sayı değildir");

    }

}