public class reverseLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node revLLbyRecursion(Node head) {
        if (head.next == null)
            return head;
        Node smallans = revLLbyRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return smallans;
    }

    static Node RevvListbyIteration(Node head) {
        if (head.next == null)// in this method we will use 3 pointer that are prev,curr and agla...........
            return head;
        Node agla = head.next;
        Node curr = head;
        Node prev = head;
        while (agla != null) {
            if (curr == head) {
                curr.next = null;
                curr = agla;
                agla = agla.next;
            } else {
                curr.next = prev;
                prev = curr;
                curr = agla;
                agla = agla.next;
            }
        }
        curr.next = prev;
        return curr;
    }

    static Node revvListInplace(Node head) {
        Node newHead = null;// best inplace method.............
        while (head != null) {
            Node agla = head.next;
            head.next = newHead;
            newHead = head;
            head = agla;
        }
        return newHead;
    }

    public static void main(String[] args) {
        Node a = new Node(0);
        Node b = new Node(6);
        Node c = new Node(9);
        Node d = new Node(19);
        Node e = new Node(34);
        Node f = new Node(58);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);
        // Node ans = revLLbyRecursion(a);
        // Node ans = RevvListbyIteration(a);
        Node ans = revvListInplace(a);
        display(ans);
    }
}
