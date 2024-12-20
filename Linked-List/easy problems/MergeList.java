public class MergeList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        for (int i = 1; temp != null; i++) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node Merge(Node n1, Node n2) {
        Node temp1 = n1;
        Node temp2 = n2;
        Node ans = new Node(0);
        Node anr = ans;
        // while (temp1 != null && temp2 != null) {
        // if (temp1.data <= temp2.data) {
        // ans.next = temp1;
        // temp1 = temp1.next;
        // ans = ans.next;
        // } else {
        // ans.next = temp2;
        // temp2 = temp2.next;
        // ans = ans.next;
        // }
        // }
        // while (temp1 != null) {
        // ans.next = temp1;
        // temp1 = temp1.next;
        // ans = ans.next;
        // }
        // while (temp2 != null) {
        // ans.next = temp2;
        // temp2 = temp2.next;
        // ans = ans.next;
        // }
        while (temp1 != null && temp2 != null) {
            if (temp1.data <= temp2.data) {
                anr.next = temp1;
                anr = temp1;
                temp1 = temp1.next;
            } else {
                anr.next = temp2;
                anr = temp2;
                temp2 = temp2.next;
            }
        }
        while (temp1 != null) {
            anr.next = temp1;
            anr = temp1;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            anr.next = temp2;
            anr = temp2;
            temp2 = temp2.next;
        }
        return ans.next;
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
        Node g = new Node(6);
        Node h = new Node(9);
        Node i = new Node(100);
        Node j = new Node(123);
        Node k = new Node(847);
        Node l = new Node(5858);
        g.next = h;
        h.next = i;
        i.next = j;
        j.next = k;
        k.next = l;
        display(a);
        display(g);
        Node ans = Merge(a, g);
        display(ans);
    }
}
