class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);

        ListNode l = left;
        ListNode r = right;
        ListNode pointer = head;

        while (pointer != null){
            if(pointer.val < x){
                l.next = pointer;
                l = l.next;
            }
            else{
                r.next = pointer;
                r = r.next;
            }
            pointer = pointer.next;
        }

        l.next = right.next;
        r.next = null;

        return left.next;
        
    }
}
