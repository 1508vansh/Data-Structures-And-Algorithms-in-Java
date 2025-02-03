class shape {
    String color;
}

class Triangle extends shape {// when we write like this this means that triangle class has taken the property
                              // of shape class......

}

public class Inheritance1 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";
        System.out.println(t1.color);
    }
}
// there are 4 types of inheritance......
// this one is single level inheritance.....