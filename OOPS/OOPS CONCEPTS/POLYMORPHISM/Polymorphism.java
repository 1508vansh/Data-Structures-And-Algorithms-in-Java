class Car {

    String name;
    int average;

    public void feature(String name, int average) {
        System.out.println(name + " CAR HAS THE AVERAGE OF" + " " + average);
    }

    public void feature(String name) {
        System.out.println(name);
    }

    public void feature(int average) {
        System.out.println(average);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Car car1 = new Car();
        // car1.name = "mahindra";
        // car1.average = 30;
        car1.feature("MAHINDRA", 18);
        car1.feature("MCLAREN");
        car1.feature(15);
        // car1.feature(car1.name);
        // car1.feature(car1.name, car1.average);
    }
}
// this is an example for polymorphism.