public class Employee {

    String name;
    Double salary;
    int workHours;
    int hireYear;


    Employee(String name, Double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {

        if (salary >= 1000)
            return (salary * 3 / 100);
        else
            return  0;
    }

    double bonus() {
        if (workHours >= 40)
            return ((workHours - 40) * 30);
        else
            return 0;
    }

    double riseSalary(){
        if(2021 - hireYear > 19)
            return (salary * 15 / 100);
        else if(2021 - hireYear > 9)
            return (salary * 10 / 100);
        else
            return (salary * 5 / 100);


    }

    public String toString() {
        System.out.println("Adı: " + name);
        System.out.println("Maaşı: " + salary);
        System.out.println("Çalışma Saati: " + workHours);
        System.out.println("Başlangıç Yılı: " + hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş Artışı: " + riseSalary());
        System.out.println("Vergi ve bonuslar ile birlikte maaş: " +  (salary + bonus() - tax()));
        System.out.println("Toplam Maaş: " + (salary + riseSalary()));
        return null;
    }
}
