import java.util.*;

public class Main {
    public static void main(String[] args) {

        takeMatrix();
    }

    public static void takeMatrix(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Dizinin row sayısını giriniz: ");
        int row = sc.nextInt();
        System.out.print("Dizinin column sayısını giriniz: ");
        int column = sc.nextInt();

        int[][] matrix = new int[row][column];



            for(int i = 0; i < row; i++) {
                for(int j = 0; j < column; j++) {
                System.out.print("Matrisin " + i + ". row " + j + ". column elemanını giriniz: ");
                matrix[i][j] = sc.nextInt();

                }
            }


        takeTranspose(matrix);

    }


    public static void takeTranspose(int[][] matrix){

        int[][] transpose = new int[matrix[0].length][matrix.length];

        for(int i = 0; i < matrix.length; i ++){
            for(int j = 0; j < matrix[0].length; j ++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        printMatrix(matrix);
        System.out.println();
        printMatrix(transpose);
    }

    public static void printMatrix(int[][] matrix){

        for(int i = 0; i < matrix.length; i ++){
            for(int j = 0; j < matrix[0].length; j ++) {
                System.out.print(matrix[i][j] + "\t");

                }
            System.out.println();
            }
    }
}
