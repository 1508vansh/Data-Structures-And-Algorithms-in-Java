//This is a GETBIT opration -----------
class Getbit {
    public static void main(String[] args) {
        int Actualno = 5;
        int pos = 3;// we can change the value of pos that where we want to pull the 1 right to left
        int bitMask = 1 << pos;
        // means 0001 << 2(pos) = 0100 that is 4 in the decimal and a non-zero number
        if ((bitMask & Actualno) == 0) {
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was one");
        }
        System.out.println(bitMask);
    }
}