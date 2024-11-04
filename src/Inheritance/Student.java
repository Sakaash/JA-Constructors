package Inheritance;

class Running {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Roshini");
        Student s3 = new Student("Vimal", 21);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

    }
}

public class Student {
    String name;
    int age;

    Student() {
        this.name = "Data Not Entered";
    }
    Student(String name) {
        this.name = name;
    }
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name + "    " + age;
    }
}


class ZSGSStudent extends Student {
    ZSGSStudent() {

    }   
    ZSGSStudent(String name) {
        super(name);
    } 
    ZSGSStudent(String name, int age) {
        super(name, age);
    }
}
