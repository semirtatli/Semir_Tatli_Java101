import java.util.*;

public class VucutKitleIndexi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        double kilo = input.nextDouble();
        double vki = kilo / (boy * boy);
        System.out.println("Vücut kitle indexiniz: " + vki);


    }
}