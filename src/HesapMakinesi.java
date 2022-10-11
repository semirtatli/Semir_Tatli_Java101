import java.util.*;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int v1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int v2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        int select = input.nextInt();


        switch (select){
            case 1:
                System.out.println("Toplama: " + (v1+v2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (v1-v2));
                break;
            case 3:
                System.out.println("Çarpma: " + (v1*v2));
                break;
            case 4:
                if(v2 != 0)
                System.out.println("Bölme: " + (v1/v2));
                else
                    System.out.println("Bir sayı sıfıra bölünemez.");
                break;
            default:
                System.out.println("Yanlış seçim yaptınız");
        }

    }
}