public class RemoveDuplicate {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode temp = head;
        ListNode ans = new ListNode(0);
        ListNode t = ans;
        boolean flag;
        while (temp != null) {
            flag = false;
            while (temp.next != null && (temp.val == temp.next.val)) {
                temp = temp.next;
                flag = true;
            }
            if (flag) {
                temp = temp.next;
                continue;
            }
            t.next = temp;
            temp = temp.next;
            t = t.next;
        }
        t.next = null;
        return ans.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(4);
        ListNode f = new ListNode(4);
        ListNode g = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        ListNode ans = deleteDuplicates(a);
        ListNode temp = ans;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}