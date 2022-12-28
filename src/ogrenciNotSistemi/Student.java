public class Student {
    String name;
    String stuNo;
    int classes;
    Course course1;
    Course course2;
    Course course3;
    double average;
    boolean isPass;

    public Student(String name, int classes, String stuNo, Course course1, Course course2, Course course3){
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
    }

    public void addBulkExamNote(int course1Note, int course2Note, int course3Note){
        if(course1Note >= 0 && course1Note <= 100)
            this.course1.note = course1Note;
        if(course2Note >= 0 && course2Note <= 100)
            this.course2.note = course2Note;
        if(course3Note >= 0 && course3Note <= 100)
            this.course3.note = course3Note;
    }

    public void isPass(){
        if(course1.note == 0 || course2.note == 0 || course3.note == 0)
            System.out.println("Notlar tam olarak girilmemiş");
        calcAverage();
        printNote();
        if (average >= 50)
            System.out.println("\nSınıfı geçti");
        else
            System.out.println("\nSınıfta kaldı");
    }

    public void calcAverage(){
        average = (course1.note + course2.note + course3.note)/3;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci: " + this.name);
        System.out.println(course1.name + " Notu : " + this.course1.note);
        System.out.println(course2.name + " Notu : " + this.course2.note);
        System.out.println(course3.name + " Notu : " + this.course3.note);
    }

}
