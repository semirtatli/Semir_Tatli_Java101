import java.util.*;

public class DaireninAlanVeCevresiniBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yaricapi giriniz: ");
        double r = input.nextDouble();
        System.out.print("Merkez aci olcusu giriniz: ");
        double aci = input.nextDouble();
        double pi = 3.14;
        double cevre = 2 * pi * r;
        double alan = pi * r * r;
        double daire_dilim = ((pi * (r * r) * 100/100.0 * aci)/360);
        System.out.println("Cevre: " + cevre + "\nAlan: " + alan + "\nDaire Dilim Alan: " + daire_dilim);
    }
}
