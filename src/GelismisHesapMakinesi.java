import java.util.*;

public class GelismisHesapMakinesi {

    static void addition(){
        Scanner input = new Scanner(System.in);
        int n1= 1, result = 0;
        System.out.println("Toplama işleminden çıkmak için 0 giriniz");
        while (n1 != 0) {
            System.out.print("Toplamaya eklenecek sayı: ");
            n1 = input.nextInt();

            result += n1;
            System.out.println("Sonuç: " + result);
        }
    }

    static void substraction(){
        Scanner input = new Scanner(System.in);
        int n1= 1, result;
        System.out.println("Çıkarma işleminden çıkmak için 0 giriniz");
        System.out.print("Çıkarma yapılacak sayı: ");
        result = input.nextInt();
        while (n1 != 0) {
            System.out.print("Çıkarmaya eklenecek sayı: ");
            n1 = input.nextInt();

            result -= n1;
            System.out.println("Sonuç: " + result);
        }
    }

    static void multiplication(){
        Scanner input = new Scanner(System.in);
        int n1= 0, result = 1;
        System.out.println("Çarpma işleminden çıkmak için 1 giriniz");
        while (n1 != 1) {
            System.out.print("Çarpmaya eklenecek sayı: ");
            n1 = input.nextInt();

            result *= n1;
            System.out.println("Sonuç: " + result);
        }
    }

    static void division(){
        Scanner input = new Scanner(System.in);
        double n1= 1, result;
        System.out.println("Bölme işleminden çıkmak için 0 giriniz");
        System.out.print("Bölünecek sayı: ");
        result = input.nextDouble();
        while (n1 != 0) {
            System.out.print("Bölmeye eklenecek sayı: ");
            n1 = input.nextDouble();
            if(n1 == 0) {
                System.out.println("Sonuç: " + result);
                break;
            }
            result /= n1;
            System.out.println("Sonuç: " + result);
        }
    }

    static void power(){
        Scanner input = new Scanner(System.in);
        int n1, n2, result;
        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        result = (int) Math.pow(n1, n2);
        System.out.println(n1 + " sayısının " + n2 + ". kuvveti: " + result);
    }

    static void factorial(){
        Scanner input = new Scanner(System.in);
        int n1,i, result = 1;
        System.out.print("Sayıyı giriniz: ");
        n1 = input.nextInt();

        for (i = n1; i > 1; i--)
            result *= i;
        System.out.println(n1 + " sayısının faktoriyeli: " + result);
    }

    static void mod(){
        Scanner input = new Scanner(System.in);
        int n1= 1, result;
        System.out.println("Mod işleminden çıkmak için 0 giriniz");
        System.out.print("Mod alınacak sayı: ");
        result = input.nextInt();
        while (n1 != 0) {
            System.out.print("Mod eklenecek sayı: ");
            n1 = input.nextInt();
            if(n1 == 0) {
                System.out.println("Sonuç: " + result);
                break;
            }
            result %= n1;
            System.out.println("Sonuç: " + result);
        }
    }

    static void rectangleAreaPerimeter(){
        Scanner input = new Scanner(System.in);
        int n1, n2, area, perimeter;
        System.out.print("Dikdörtgenin ilk kenarını giriniz: ");
        n1 = input.nextInt();
        System.out.print("Dikdörtgenin ikinci kenarını giriniz: ");
        n2 = input.nextInt();

        area = n1 * n2;
        perimeter = n1*2 + n2*2;
        System.out.println("Diktörtgenin alanı ve çevresi: " + area + ", " + perimeter);
    }


    public static void main(String[] args) {
        int op = 1;
        Scanner input = new Scanner(System.in);
        String menu = "1 - Toplama İşlemi\n"
                + "2 - Çıkarma İşlemi\n"
                + "3 - Çarpma İşlemi\n"
                + "4 - Bölme İşlemi\n"
                + "5 - Üslü Sayı Hesaplama\n"
                + "6 - Faktöriyel Hesaplama\n"
                + "7 - Mod Alma\n"
                + "8 - Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0 - Çıkış Yap\n";

        while (op != 0){

            System.out.print(menu + "Yapmak istediğiniz işlemi giriniz: ");
            op = input.nextInt();

        switch (op) {
            case 1:
                addition();
                break;
            case 2:
                substraction();
                break;
            case 3:
                multiplication();
                break;
            case 4:
                division();
                break;
            case 5:
                power();
                break;
            case 6:
                factorial();
                break;
            case 7:
                mod();
                break;
            case 8:
                rectangleAreaPerimeter();
                break;
            case 0:
                break;
            default:
                System.out.println("Lütfen geçerli bir işlem giriniz!");
        }





        }




    }
}