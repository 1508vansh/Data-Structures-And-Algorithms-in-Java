import java.util.LinkedList;

public class DeleteNode {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    static class linklist {
        Node head = null;
        Node tail = null;
        int size = 0;

        void add(int elem) {
            Node temp = head;
            Node val = new Node(elem);
            if (head == null) {
                head = val;
                tail = val;
                size++;
            } else {
                for (int i = 1; i <= size - 1; i++) {
                    temp = temp.next;
                }
                temp.next = val;
                tail = val;
                size++;
            }
        }

        void display() {
            Node temp = head;
            for (int i = 1; temp != null; i++) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        Node findFromend(int n) {
            // Node temp = head;
            // for (int i = 1; i <= size - n; i++) {//O(n) time complexity....if size is not
            // given and size is calculated by other loop......
            // temp = temp.next;
            // }
            // return temp;
            Node slow = head;
            Node fast = head;
            for (int i = 1; i <= n; i++) {// this would take one traverse only if we ignore this
                                          // loop.................this is very
                                          // imp method.........
                fast = fast.next;
            }
            while (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }

        void DeleteNthNodeFromEnd(int n) {
            Node slow = head;
            Node fast = head;
            for (int i = 1; i <= n; i++) {
                fast = fast.next;
            }
            if (fast == null) {
                head = head.next;
                return;
            }
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;
        }

    }

    public static void main(String[] args) {
        linklist LL = new linklist();
        LL.add(2);
        LL.add(4);
        LL.add(0);
        LL.add(7);
        LL.add(9);
        LL.display();
        Node ans = LL.findFromend(2);
        System.out.println(ans.data);
        LL.DeleteNthNodeFromEnd(5);
        LL.display();
    }
}