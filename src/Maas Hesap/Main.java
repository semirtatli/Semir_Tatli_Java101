import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen çalışanın adını giriniz: ");
        String name = sc.next();
        System.out.print("Lütfen çalışanın maaşını giriniz: ");
        double salary = sc.nextDouble();
        System.out.print("Lütfen çalışanın haftalık çalışma saatini giriniz: ");
        int workHours = sc.nextInt();
        System.out.print("Lütfen çalışanın işe giriş yılını giriniz: ");
        int hireYear = sc.nextInt();

        Employee employee = new Employee(name, salary, workHours, hireYear);
        employee.toString();
    }
}