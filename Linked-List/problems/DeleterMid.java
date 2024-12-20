public class DeleterMid {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    static Node deletemid(Node head) {// if right mid is considered in the case of even elements
        Node fast = head;
        Node slow = head;
        if (head.next == null) {
            head = head.next;
            return head;
        }
        while (fast.next != null) {
            if (fast.next.next == null) {
                slow.next = slow.next.next;
                return head;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.val = slow.next.val;
        slow.next = slow.next.next;
        return head;
    }

    static void display(Node head) {
        Node temp = head;
        for (int i = 0; temp != null; i++) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(7);
        Node e = new Node(1);
        Node f = new Node(2);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);
        a = deletemid(a);
        display(a);
    }
}