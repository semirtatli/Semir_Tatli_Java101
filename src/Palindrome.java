import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isPalindrome = true;

        System.out.print("Kelimeyi giriniz: ");
        String str1 = sc.next();



            for (int i = 0; i < str1.length(); i++){
                if(str1.charAt(i) != str1.charAt(str1.length()-1-i)){
                    isPalindrome = false;
                    break;}
            }


        if (isPalindrome)
            System.out.println("Girilen kelime palindrome");
        else
            System.out.println("Girilen kelime palindrome değildir");

    }
}
