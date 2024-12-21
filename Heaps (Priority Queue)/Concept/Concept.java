import java.util.PriorityQueue;

public class Concept {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(9);
        q.add(3);
        System.out.println(q);
        q.add(0);
        System.out.println(q);
        q.add(10);
        q.add(-1);
        System.out.println(q);
    }
}