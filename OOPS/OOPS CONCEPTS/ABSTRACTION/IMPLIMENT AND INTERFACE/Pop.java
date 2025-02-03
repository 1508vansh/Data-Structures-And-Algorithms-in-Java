/**
 * Pop
 */
interface Animal {
    public void walk();
}

class horse implements Animal {
    public void walk() {
        System.out.println("WALKS ON 4 LEGS");
    }
}

public class Pop {
    public static void main(String[] args) {
        horse h1 = new horse();
        h1.walk();
    }
}