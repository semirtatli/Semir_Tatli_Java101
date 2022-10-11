import java.util.*;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        String userName = input.nextLine();
        System.out.print("Parolanızı giriniz: ");
        String password = input.nextLine();

        if( userName.equals("patika") && password.equals("java123"))
            System.out.println("Giriş Yaptınız");
        else {
            System.out.println("Bilgileriniz yanlis");
            System.out.println("Şifrenizi sıfırlamak ister misiniz (evet için y, hayır için n)");
            char sifirlama = input.next().charAt(0);
            if (sifirlama == 'y'){
                input.nextLine();
                System.out.print("Yeni şifrenizi giriniz: ");
                String newPassword = input.nextLine();
                if (password.equals(newPassword) || newPassword.equals("java123"))
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz!");
                else
                    System.out.println("Şifre oluşturuldu");
            }
            else
                System.out.println("Yeniden giriş yapmayı deneyiniz");

        }
    }
}