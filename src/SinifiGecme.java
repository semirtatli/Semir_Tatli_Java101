import java.util.*;

public class SinifiGecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik: ");
        int matematik = input.nextInt();
        if(matematik > 100 || matematik < 0)
            matematik = 0;
        System.out.println("Fizik: ");
        int fizik = input.nextInt();
        if(fizik > 100 || fizik < 0)
            fizik = 0;
        System.out.println("Türkçe: ");
        int turkce = input.nextInt();
        if(turkce > 100 || turkce < 0)
            turkce = 0;
        System.out.println("Kimya: ");
        int kimya= input.nextInt();
        if(kimya > 100 || kimya < 0)
            kimya = 0;
        System.out.println("Müzik: ");
        int muzik = input.nextInt();
        if(muzik > 100 || muzik < 0)
            matematik = 0;

        double average = (matematik + fizik + turkce + kimya + muzik) / 5.0;

        if(average >55)
            System.out.println("Sınıfı geçtiniz");
        else
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere");

        System.out.println("Ortalamanız: "+ average);


    }
}