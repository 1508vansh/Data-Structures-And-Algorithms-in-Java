class shape {
    public void area() {
        System.out.println("this is area");
    }
}

class rectangle extends shape {
    public void area(int l, int b) {
        System.out.println("the area of rectangle is " + l * b);
    }
}

class circle extends shape {
    public void area(int r) {
        System.out.println("the area of the circle is " + 3.14 * r * r);
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        rectangle rc = new rectangle();
        rc.area();
        rc.area(20, 30);
        circle cr = new circle();
        cr.area(5);
    }
}