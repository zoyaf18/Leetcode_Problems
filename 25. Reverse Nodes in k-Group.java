class Solution {
    ListNode reverse(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = null, curr = head, next = head.next;
      
        while (next != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }
        curr.next = prev;
        return curr;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr = dummy;

        while(curr != null){
            ListNode temp = curr;

            for (int i = 0; i < k; i++){
                temp = temp.next;
                if (temp==null) return dummy.next;
            }

            ListNode newStart = temp.next;
            ListNode last = curr.next;

            temp.next = null;
            curr.next = reverse(curr);
            last.next = newStart;
            curr = last;
        }
        return dummy.next;
    }
}
