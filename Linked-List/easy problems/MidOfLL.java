public class MidOfLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node Mid(Node head) {
        // int size = 0;//we can also use this method but this is brute force approach ,
        // we have another best approach using two pointers;
        // Node temp = head;
        // for (int i = 1; temp != null; i++) {
        // size++;
        // temp = temp.next;
        // }
        // if (size % 2 == 0)
        // size = size - 1;
        // temp = head;
        // System.out.println(size);
        // int mid = size / 2;
        // for (int i = 1; i <= mid; i++) {
        // temp = temp.next;
        // }
        // return temp;
        Node slow = head;
        Node fast = head;
        // here we can't write fast!=null condion after fast.next!=null condition
        // because first of all compliler will check left side condition of &&
        // operator...
        while (fast != null && fast.next != null) {// if Right mid is considered in the case of even
            // element
            slow = slow.next;
            // if (fast.next.next == null)//this could also be used ......remove fast !=
            // null condition......
            // return slow;
            fast = fast.next.next;
        }
        return slow;
        // while (fast.next != null && fast.next.next != null) {// if left mid is
        // considered in the case of even element
        // // if (fast.next.next == null) {//this could also be a method.........remove
        // // fast.next.next != null condition
        // // return slow;
        // // }
        // slow = slow.next;
        // fast = fast.next.next;
        // }
        // return slow;
    }

    public static void display(Node head) {
        Node temp = head;
        for (int i = 1; temp != null; i++) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(0);
        Node b = new Node(6);
        Node c = new Node(9);
        Node d = new Node(1);
        Node e = new Node(34);
        Node f = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);
        Node ans = Mid(a);
        System.out.println(ans.data);
    }
}
