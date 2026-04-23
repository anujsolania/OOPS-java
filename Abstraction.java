abstract class Animal {
    abstract void walk();
}

class Horse extends Animal {
    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}

//static keyword
class Student {
    String name;
    static String school;
}

public class Abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();

        Student.school = "KHALSA";

        System.out.println(Student.school);
    }
}