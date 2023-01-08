import java.util.*;

public class Main {
    public static void main(String[] args) {

    int[] list = {4, 8, 24, 6, 3, 75, 2, 4, 24, 3, 1, 17, 8, 56, 56, 1};
    int[] test = new int[list.length];
    int index = 0;


    for(int i = 0; i < list.length; i++){
        for(int j = i; j < test.length; j++){
            if(list[i] == list[j] && i != j) {
                test[index] = list[i];
                index++;
                break;
            }
        }

    }

        System.out.println(Arrays.toString(test));


    }
}
