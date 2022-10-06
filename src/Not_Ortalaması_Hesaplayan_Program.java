import java.util.*;

public class Not_Ortalaması_Hesaplayan_Program {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Math grade: ");
        double Math = input.nextDouble();
        System.out.print("Enter the Physics grade: ");
        double Physics = input.nextDouble();
        System.out.print("Enter the Chemistry grade: ");
        double Chemistry = input.nextDouble();
        System.out.print("Enter the Turkish grade: ");
        double Turkish = input.nextDouble();
        System.out.print("Enter the History grade: ");
        double History = input.nextDouble();
        System.out.print("Enter the Music grade: ");
        double Music = input.nextDouble();

        double grade = (Math+Physics+Chemistry+Turkish+History+Music)/6;

        String pass = grade>=60 ? "Sınıfı geçti" : "Sınıfta kaldı";
        System.out.println(pass);


    }
}