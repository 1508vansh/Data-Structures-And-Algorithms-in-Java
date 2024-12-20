public class CreateLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static class linklist {
        Node head = null;
        Node tail = null;
        int Size = 0;

        void addAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {// if there is no element in LL........
                head = temp;
                tail = temp;
                Size++;
            } else {// this function will work if tail is given...........
                tail.next = temp;
                tail = temp;
                Size++;
            }
        }

        void addAtStart(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
                Size++;
                // we can also call addAtEnd function here by passing the same value because the
                // list is empty.......
            } else {
                temp.next = head;
                head = temp;
                Size++;
            }
        }

        void InsertAt(int idx, int val) {
            Node temp = head;
            Node elem = new Node(val);
            if (idx < 0 || idx > Size)
                System.out.println("Invalid Index");
            else if (idx == 0) {
                elem.next = head;
                head = elem;
                Size++;
            } else if (idx == Size) {
                addAtEnd(val);
            } else {
                for (int i = 1; i <= idx - 1; i++) {// Because hame apne loop ko idx-1 tak le jakr operation perform
                    // karna h.........
                    temp = temp.next;
                }
                elem.next = temp.next;
                temp.next = elem;
                Size++;// we can also create a different loop for calculating the size of the
                       // LL............
            }
        }

        void getAt(int idx) {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            System.out.println(temp.data);
        }

        void InsetAtend(int val) {// if tail is not given , only head is given.........
            Node temp = head;
            Node elem = new Node(val);
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = elem;
            tail = elem;
            Size++;
        }

        void Display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void DeleteAt(int idx) {
            Node temp = head;
            if (idx == 0) {
                head = temp.next;
                Size--;
            } else if (idx == Size - 1) {
                for (int i = 1; i <= idx - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                Size--;
                tail = temp;
            } else {
                for (int i = 1; i <= idx - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                Size--;
            }
        }

        void size() {
            System.out.println(this.Size);
        }
    }

    public static void main(String[] args) {
        linklist LL = new linklist();
        LL.addAtEnd(1);
        LL.addAtEnd(0);
        LL.addAtEnd(5);
        LL.Display();
        LL.size();
        LL.addAtEnd(9);
        LL.Display();
        LL.size();
        LL.addAtStart(34);
        LL.Display();
        LL.size();
        LL.InsertAt(2, 70);
        LL.Display();
        LL.InsertAt(0, 0);
        LL.Display();
        LL.size();
        System.out.println(LL.tail.data);
        LL.InsertAt(7, 100);
        LL.Display();
        System.out.println(LL.tail.data);
        LL.InsertAt(-1, 90);
        LL.getAt(3);
        LL.InsetAtend(500);
        LL.Display();
        System.out.println("Size before");
        LL.size();
        LL.DeleteAt(3);
        LL.Display();
        System.out.println("Size is now ");
        LL.size();
        System.out.println("Tail is " + LL.tail.data);
        LL.DeleteAt(7);
        LL.Display();
        System.out.println("Tail is " + LL.tail.data);
        System.out.println("head is " + LL.head.data);
        LL.DeleteAt(0);
        LL.Display();
        System.out.println("head is " + LL.head.data);
    }
}
