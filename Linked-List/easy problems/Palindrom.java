import org.w3c.dom.Node;

public class Palindrom {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
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

    static boolean Ispalindrome(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node revslow = reverseLL(slow);
        fast = head;
        while (revslow != null && fast != null) {
            if (revslow.data == fast.data) {
                fast = fast.next;
                revslow = revslow.next;
            } else {
                return false;
            }
        }
        return true;
    }

    static Node reverseLL(Node head) {
        Node temp = null;
        while (head != null) {
            Node t = head.next;
            head.next = temp;
            temp = head;
            head = t;
        }
        return temp;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(3);
        Node e = new Node(2);
        Node f = new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);
        System.out.println(Ispalindrome(a));
    }
}
