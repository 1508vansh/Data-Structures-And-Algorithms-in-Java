public class Random {
    public static void kalua(String a) {
        for (int i = 4; i >= 0; i--) {
            System.out.print(a.charAt(i));
        }
        return;
    }

    public static void main(String[] args) {
        String a = "vansh";
        kalua(a);
    }
}
