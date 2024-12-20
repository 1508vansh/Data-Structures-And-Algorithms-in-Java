public class Oddeven {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode oddEven(ListNode head) {
        if (head == null || head.next == null)
            return head;
        // ListNode l1 = new ListNode(-1);
        // ListNode head1 = l1;
        // ListNode l2 = new ListNode(-1);
        // ListNode head2 = l2;
        // ListNode temp = head;
        // int size = 1;
        // while(temp!=null){
        // if(size%2!=0){
        // l1.next = new ListNode(temp.val);
        // l1 = l1.next;
        // temp = temp.next;
        // size++;
        // }else{
        // l2.next = new ListNode(temp.val);
        // l2 = l2.next;
        // temp = temp.next;
        // size++;
        // }
        // }
        // head2 = head2.next;
        // head1 = head1.next;
        // l1.next = head2;
        // return head1;
        ListNode l1 = head;
        ListNode l2 = head.next;
        ListNode head1 = l1;
        ListNode head2 = l2;
        while (l1 != null && l1.next != null) {
            l1.next = l1.next.next;
            if (l2.next == null)
                break;
            l2.next = l2.next.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        l1.next = head2;
        return head1;
    }

    public static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
        a = oddEven(a);
        display(a);
    }
}