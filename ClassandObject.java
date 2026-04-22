class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // paramterized constructer
    // Student(String name, int age) {
    //     this.name = name;
    //     this.age = age;
    // }

    //unparametrized constructer
    Student() {

    }

    //copied constructer
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

}

public class ClassandObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "anuj";
        s1.age = 22;
        // Student s1 = new Student("anuj", 22);
        Student s2 = new Student(s1);
        s2.printInfo();
    }
}