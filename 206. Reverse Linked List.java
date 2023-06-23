class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = null;
        ListNode pres = head;
        ListNode nex = head.next;
        
        while (pres != null){
            pres.next = prev;
            prev = pres;
            pres = nex;
            if (nex != null){
                nex = nex.next;
            }
        }
        head = prev;
        return head;
    }
}
