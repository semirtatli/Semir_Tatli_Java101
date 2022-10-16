

public class AsalSayiBirYuz {
    public static void main(String[] args) {
        int i,j, number = 100;
        boolean isPrime;
        for(i = 2; i < number; i++){
            isPrime = true;
            for (j = 2; j < i; j++) {

                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                System.out.print(i + " ");
        }
    }
}