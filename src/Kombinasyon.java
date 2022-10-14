import java.util.*;

public class Kombinasyon {
    public static void main(String[] args) {
        int i, N, r, nr, nFak = 1, rFak = 1, nrFak = 1, kombinasyon;
        Scanner input = new Scanner(System.in);
        System.out.println("N elemanlı bir kümenin r elemanlı grup kombinasyonlarını bulan program\n");
        System.out.print("Toplam eleman sayısını giriniz(N): ");
        N = input.nextInt();
        System.out.print("Grup eleman sayısını giriniz(r): ");
        r = input.nextInt();



        for(i = 1 ; i <= N; i++){
          nFak *= i;
        }

        for(i = 1 ; i <= r; i++){
            rFak *= i;
        }

        nr = N-r;
        for(i = 1 ; i <= nr; i++){
            nrFak *= i;
        }

        kombinasyon = nFak / (rFak * nrFak);

        System.out.println(N + " elemanlı kümenin " + r + "'lı kombinasyonu: " + kombinasyon);
    }
}