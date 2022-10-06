import java.util.*;

public class Dik_Ucgende_Hipotenus_Bulan_Program {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    System.out.print("A kenarinin uzunlugunu giriniz: ");
    int a = input.nextInt();
    System.out.print("B kenarinin uzunlugunu giriniz: ");
    int b = input.nextInt();
    double c = Math.sqrt(a*a+b*b);
    System.out.println("Hipotenusun uzunlugu: " + c);

    }
}
