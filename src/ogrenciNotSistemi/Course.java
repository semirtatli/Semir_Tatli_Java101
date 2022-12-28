public class Course {
    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher;


    public Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;

    }

    public void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix))
            this.teacher = teacher;
        else
            System.out.println(teacher.name + " akademisyeni bu dersi veremez");
    }


    public void printTeacher(){
        if(teacher != null)
            System.out.println(name + " dersini " + teacher.name + " akademisyeni veriyordur");
        else
            System.out.println(name + " dersinin henüz akademisyeni yoktur.");
    }


}
