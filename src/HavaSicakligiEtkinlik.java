import java.util.*;

public class HavaSicakligiEtkinlik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz: ");
        int heat = input.nextInt();
        
        if (heat<5)
            System.out.println("Kayak yapabilirsiniz");
        else if (heat < 10)
            System.out.println("Sinemaya gidebilirsiniz");
        else if (heat >= 10 && heat <= 15) {
            System.out.println("Sinemaya gidebilir veya piknik yapabilirsiniz");
        }
        else if (heat < 25)
            System.out.println("Piknik yapabilirsiniz");
        else
            System.out.println("Yüzmeye gidebilirsiniz");

    }
}
