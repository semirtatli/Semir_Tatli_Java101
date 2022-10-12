import java.util.*;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;
        boolean isArtik;
        System.out.print("Yıl giriniz: ");
        yil = input.nextInt();

        if (yil % 400 == 0)
            isArtik = true;
        else if (yil % 100 == 0)
            isArtik = false;
        else if (yil % 4 == 0)
            isArtik = true;
        else
            isArtik = false;

        if (isArtik)
            System.out.println(yil + " bir artık yıldır");
        else
            System.out.println(yil + " bir artik yıl değildir");

    }
}