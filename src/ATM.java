import java.util.*;

public class ATM {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3, select, balance = 1500, miktar;

        while (right > 0) {
            System.out.print("Kullanıcı adınızı giriniz: ");
            userName = input.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            password = input.nextLine();

            if(userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba, Kodluyoruz bankasına hoşgeldiniz");
                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: \n");
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış Yap");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz miktarı girin: ");
                            miktar = input.nextInt();
                            balance += miktar;
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz miktarı girin: ");
                            miktar = input.nextInt();
                            if(balance - miktar >= 0)
                                balance -= miktar;
                            else
                                System.out.println("Yeteri kadar bakiyeniz bulunmamaktadır");
                            break;
                        case 3:
                            System.out.println("Mevcut bakiye miktarınız: " + balance + "\n");
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Lütfen geçerli bir işlem seçiniz\n");
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere");
                    break;
            } else {
                System.out.println("Hatalı giriş yaptınız lütfen tekrar deneyiniz");
                right--;
                if (right == 0)
                    System.out.println("Hesabınız bloke olmuştur. Lütfen bankayla görüşünüz");
                else
                    System.out.println("Kalan giriş hakkınız: " + right);
            }

        }


    }
}