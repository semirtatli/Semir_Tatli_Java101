import java.util.*;

public class Dik_Ucgende_Hipotenus_Bulan_Program {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    System.out.print("A kenarinin uzunlugunu giriniz: ");
    double a = input.nextDouble();
    System.out.print("B kenarinin uzunlugunu giriniz: ");
    double b = input.nextDouble();
    System.out.print("C kenarinin uzunlugunu giriniz: ");
    double c = input.nextDouble();
    double u = (a+b+c)/2;
    double alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
    System.out.println("Alan: " + alan);

    }
}
