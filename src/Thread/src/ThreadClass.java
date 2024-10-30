import java.util.ArrayList;

public class ThreadClass implements Runnable {

    ArrayList<Integer> numbers;
    ArrayList<Integer> evenNumbers;
    ArrayList<Integer> oddNumbers;
    int range;



    private Object LOCK = new Object();

    public ThreadClass(ArrayList numbers, ArrayList<Integer> evenNumbers, ArrayList<Integer> oddNumbers,int range) {
        this.numbers = numbers;
        this.evenNumbers = evenNumbers;
        this.oddNumbers = oddNumbers;
        this.range = range;
    }

    @Override
    public void run() {

       // synchronized (LOCK) {
            String threadName = Thread.currentThread().getName();


                for (int i = range; i < range + 2500; i++) {
                    int currentNumber = numbers.get(i);
                    if (currentNumber % 2 == 0) {
                        synchronized (evenNumbers) {
                            evenNumbers.add(currentNumber);
                        }
                    } else {
                        synchronized (oddNumbers) {
                            oddNumbers.add(currentNumber);
                        }
                    }
                }
       // }
    }
}