public class PrintLLrec {
    static void printLLrev(Node head) {// for reverse..
        if (head == null)
            return;
        printLLrev(head.next);
        System.out.print(head.data + " ");
    }

    static void printLL(Node head) {// for normal....
        if (head == null)
            return;
        System.out.print(head.data + " ");
        printLL(head.next);
    }

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(0);
        Node b = new Node(6);
        Node c = new Node(9);
        Node d = new Node(1);
        Node e = new Node(34);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        printLL(a);// because a is head..........
        // above will print the normal LL
        System.out.println();
        printLLrev(a);// this will print LL in reverse order..................
    }
}
