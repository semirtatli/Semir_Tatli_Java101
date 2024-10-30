import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();

        for(int i = 1; i <= 10000; i++){
            numbers.add(i);
        }

        ThreadClass obj1 = new ThreadClass(numbers, evenNumbers, oddNumbers, 0);
        ThreadClass obj2 = new ThreadClass(numbers, evenNumbers, oddNumbers, 2500);
        ThreadClass obj3 = new ThreadClass(numbers, evenNumbers, oddNumbers, 5000);
        ThreadClass obj4 = new ThreadClass(numbers, evenNumbers, oddNumbers, 7500);

        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);
        Thread thread3 = new Thread(obj3);
        Thread thread4 = new Thread(obj4);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Even numbers list size: " + evenNumbers.size());
        System.out.println("Odd numbers list size: " + oddNumbers.size());

        for (int i = 0; i < 5000; i++) {
            if (i < oddNumbers.size()) {
                System.out.println(oddNumbers.get(i));
            }
        }

        for (int i = 0; i < 5000; i++) {
            if (i < evenNumbers.size()) {
                System.out.println(evenNumbers.get(i));
            }
        }
    }
}