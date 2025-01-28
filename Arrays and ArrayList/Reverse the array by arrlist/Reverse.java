import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {
    static void reverse(ArrayList<Integer> alist) {
        int k = alist.size();
        for (int i = 0; i < k; i++) {
            Integer temp = Integer.valueOf(alist.get(i));
            alist.set(i, alist.get(k - 1));
            alist.set(k - 1, temp);
            k--;
        }
        System.out.println("Reversed array");
        System.out.println(alist);
    }

    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        System.out.println("How many elements do you want to define");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Define the elements");
        for (int i = 0; i < n; i++) {
            Integer j = sc.nextInt();
            l1.add(j);
        }
        System.out.println("Original array");
        System.out.println(l1);
        reverse(l1);
    }
}