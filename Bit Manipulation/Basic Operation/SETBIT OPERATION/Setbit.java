public class Setbit {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        // this will (bitresult) give us 0010 and then it will
        // convert it to binary form that is 2;
        int Bitmask = 1 << b;
        int wow = Bitmask | a;
        // NOW THE BINARY OF '2' WILL MAKE 'OR' CONDITION WITH THE 'a' AND,
        // THE 'a' IS 5 WHOSE BINARY IS 0101 , SO BINARY OF 2 AND 5 WILL GIVE
        // CONDITION AND RETURN '0111' WHICH IS 7 IN DECIMAL.
        System.out.println(wow);

    }

}
