import java.util.ArrayList;
import java.util.Collections;

public class Arrlist {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        // We can create arraylist of a particular similar datatype by using the object
        // of that datatype class from wrapper class as we created above
        // and we can also create arrlist of mix data type like below without pointing
        // out any particular datatype...............
        ArrayList l2 = new ArrayList();
        Integer j = Integer.valueOf(16);// this is used for creating int object instead of actual int values 'cause java
                                        // is object oriented language..........
        System.out.println("thsi " + ans);
        l2.add(j);
        l2.add("vansh");
        l2.add(3);
        l2.add(2, true);
        // System.out.println(l2);
        // int x = l2.remove(j);
        // l2.add(j);
        // System.out.println();
        // and hence we can perform lots of function like .remove .set
        // etc............................
        // to add elements
        l1.add(0);
        l1.add(4);
        l1.add(7);
        l1.add(9);
        l1.add(1);
        System.out.println(l1);
        int y = l1.remove(0);
        System.out.println("This is removed value " + y);
        l1.add(y);
        System.out.println(l1);
        // System.out.println(l1);

        // to get the size of the arraylist
        int arrsize = l1.size();
        System.out.println(arrsize);

        // to get the element by index
        int getelem = l1.get(3);
        System.out.println(getelem);

        // to add element in between
        l1.add(1, 6);
        System.out.println(l1);

        // to delete any element of arraylist
        int x = l1.remove(1);
        System.out.println(x);

        // to set element or replace element
        l1.set(1, 1);
        System.out.println(l1);

        // to print element one by one with the help of loop
        for (int i = 0; i < arrsize; i++) {
            System.out.print(l1.get(i) + " ");
        }
        System.out.println();
        // to sort the elements of arraylist or to print in ascending order
        Collections.sort(l1);
        System.out.println(l1);
    }
}