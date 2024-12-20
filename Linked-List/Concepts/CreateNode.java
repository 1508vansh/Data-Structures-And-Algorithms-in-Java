public class CreateNode {// In linked list Node is said to be a user defined data type , which is a
                         // object in reality.......
                         // and there is also a 'next' variable which is of node data type (which is also
                         // object in reality)
                         // ...........So basically we can say that in linked list we have to
                         // declare a user defined data type (Node) and we have to also create a next
                         // variable of 'Node' data type for saving the address of another node or
                         // another value................
                         // but in code we will assume only at high level..................we won't be
                         // thinking always about the objects....................
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
        // Printing the linked list or all the variables of linked list...............
        /*
         * Node temp = a;// for this we will take the variable 'temp' of node type
         * // and will store the value of head; then we will print all the elemets by
         * for
         * // loop...
         * for (int i = 0; temp.next != null; i++) {
         * System.out.print(temp.data + " -> ");
         * temp = temp.next;
         * }
         * System.out.println(temp.data);// we can also do 'temp!=null' directly in the
         * loop that will print all the
         * // elements directly..
         */
        Node tem = a;
        for (int i = 0; tem != null; i++) {
            System.out.print(tem.data + " ");
            tem = tem.next;
        } // we can do same thing with while loop.............
    }
}