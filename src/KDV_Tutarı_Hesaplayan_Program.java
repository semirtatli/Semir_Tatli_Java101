import java.util.*;

public class KDV_Tutarı_Hesaplayan_Program {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price without KDV: ");
        int first_price = input.nextInt();
        int kdv = first_price >= 1000? 8 : 18;
        double total_price = first_price * (100+kdv) / 100.0;
        double kdv_price = (first_price)*(kdv)/100.0;
        kdv_price = kdv_price *100.0/100;
        System.out.println("KDV'li fiyat: " + total_price + " KDV fiyatı: " + kdv_price);

    }
}