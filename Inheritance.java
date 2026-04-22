class Shape {
    String color;
    // public void area() {
    //     System.out.println("area of shape");
    // }
}

class Triangle extends Shape {
    int sides;
    // public void area(int l, int h) {
    //     System.out.println(l*h); 
    // }
}

class EquiTriangle extends Triangle {
    
}

public class Inheritance {
    public static void main(String[] args) {
        EquiTriangle t1 = new EquiTriangle();
        t1.color = "red";
        t1.sides = 3;

        System.out.println(t1.color + " " + t1.sides);

    }

}