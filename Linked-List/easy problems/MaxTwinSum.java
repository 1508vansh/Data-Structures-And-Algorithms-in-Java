public class MaxTwinSum {// Only for even elements....................
    public static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static int pairSum(Node head) {
        int ans = Integer.MIN_VALUE;
        Node slow = head;
        Node fast = head;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = head;
        slow = reverseLL(slow);
        while (slow != null) {
            ans = Math.max(slow.val + fast.val, ans);
            slow = slow.next;
            fast = fast.next;
        }
        return ans;
    }

    public static Node reverseLL(Node head) {
        Node temp = null;
        while (head != null) {
            Node agla = head.next;
            head.next = temp;
            temp = head;
            head = agla;
        }
        return temp;
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(5);
        Node e = new Node(9);
        Node f = new Node(0);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);
        System.out.println("Max twin sum is : ");
        System.out.println(pairSum(a));
    }
}
