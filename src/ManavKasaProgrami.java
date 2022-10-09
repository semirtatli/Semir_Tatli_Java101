import java.util.*;

public class ManavKasaProgrami {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            double armut_fiyat = 2.14;
            double elma_fiyat = 3.67;
            double domates_fiyat = 1.11;
            double muz_fiyat = 0.95;
            double patlican_fiyat = 5.00;


            System.out.print("Armut kaç kilo: ");
            int armut = input.nextInt();
            System.out.print("Domates kaç kilo: ");
            int domates = input.nextInt();
            System.out.print("Elma kaç kilo: ");
            int elma = input.nextInt();
            System.out.print("Muz kaç kilo: ");
            int muz = input.nextInt();
            System.out.print("Patlıcan kaç kilo: ");
            int patlican = input.nextInt();

            double toplam_fiyat = armut_fiyat * armut + elma_fiyat * elma + domates_fiyat * domates
                    + muz_fiyat * muz + patlican_fiyat * patlican;

            System.out.println("Toplam tutar: " + toplam_fiyat);
        }

}
