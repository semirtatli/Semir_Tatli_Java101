import java.util.*;

public class UcakBiletFiyati {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km, yas, yolculuk;
        double toplam, indirim;
        System.out.print("Mesafeyi km olarak giriniz: ");
        km = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipinizi(1 => Tek Yön,2 => Gidiş-Dönüş) giriniz: ");
        yolculuk = input.nextInt();

        if (km <= 0 || yas < 0 || (yolculuk != 1 && yolculuk != 2))
            System.out.println("Hatalı veri girdiniz");
        else {
            toplam = km * 0.10;
            if (yas < 12)
                indirim = toplam * (50 / 100.0);
            else if (yas < 24)
                indirim = toplam * (10 / 100.0);
            else if (yas > 24 && yas < 65)
                indirim = 0;
            else
                indirim = toplam * (30 / 100.0);
            toplam -= indirim;
            if (yolculuk == 2) {
                toplam -= toplam * (20 / 100.0);
                toplam *= 2;
            }

            System.out.println("Toplam Tutar: " + toplam + " TL");
        }
    }
}