public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        double harmoni = 0;
        int sum = 0;


        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }

        System.out.println("Dizinin ortalaması: " + sum/ numbers.length);

        for(int i = 0; i < numbers.length; i++){
            harmoni += 1.0/numbers[i];
        }

        harmoni = numbers.length / harmoni;
        System.out.println("Dizinin harmonik ortalaması: " + harmoni );
    }
}