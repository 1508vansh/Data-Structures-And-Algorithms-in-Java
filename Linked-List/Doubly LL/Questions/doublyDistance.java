public class doublyDistance {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void displayP(Node tail) {
        if (tail == null) {
            return;
        }
        displayP(tail.prev);
        System.out.print(tail.data + " ");
    }

    public static int[] Distance(Node head, Node tail) {
        Node LastCC = null;
        Node firstCC = null;
        Node extraCC = null;
        int first = 1;
        int second = 0;
        int third = 1;
        Node temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        size -= 1;
        temp = head.next;
        while (temp != null) {
            if (temp.data > temp.next.data && temp.data > temp.prev.data) {
                firstCC = temp;
                break;
            } else if (temp.data < temp.next.data && temp.data < temp.prev.data) {
                firstCC = temp;
                break;
            }
            temp = temp.next;
            first++;
        }
        second = first + 1;
        temp = temp.next;
        while (temp != null) {
            if (temp.data > temp.next.data && temp.data > temp.prev.data) {
                extraCC = temp;
                break;
            } else if (temp.data < temp.next.data && temp.data < temp.prev.data) {
                extraCC = temp;
                break;
            }
            temp = temp.next;
            second++;
        }
        temp = tail.prev;
        while (temp != null) {
            if (temp.data > temp.next.data && temp.data > temp.prev.data) {
                LastCC = temp;
                break;
            } else if (temp.data < temp.next.data && temp.data < temp.prev.data) {
                LastCC = temp;
                break;
            }
            temp = temp.prev;
            third++;
        }
        int max = size - first - third;
        int min = second - first;
        int[] ans = { min, max };
        return ans;
    }

    public static void main(String[] args) {
        Node a = new Node(0);
        Node b = new Node(1);
        Node c = new Node(7);// c
        Node d = new Node(6);
        Node e = new Node(5);
        Node f = new Node(4);// c
        Node g = new Node(6);
        Node h = new Node(7);
        Node i = new Node(0);// c
        Node j = new Node(9);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;
        b.prev = a;
        c.prev = b;
        d.prev = c;
        e.prev = d;
        f.prev = e;
        g.prev = f;
        h.prev = g;
        i.prev = h;
        j.prev = i;
        display(a);
        int[] ans = Distance(a, j);
        for (int elem : ans)
            System.out.print(elem + " ");
    }
}