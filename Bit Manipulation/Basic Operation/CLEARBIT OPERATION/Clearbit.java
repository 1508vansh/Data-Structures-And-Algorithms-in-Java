public class Clearbit {
    public static void main(String[] args) {
        int Actualno = 5;
        int pos = 2;
        int Bitmask = 1 << pos;
        int hah = ~(Bitmask);
        int vansh = hah & Actualno;
        System.out.println(vansh);

    }
}