class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;

        ListNode headSecond = reverseList(mid);
        ListNode rereverseHead = headSecond;

        while(head != null && headSecond != null){
            if(head.val != headSecond.val){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(rereverseHead);

        return head == null || headSecond == null;
    }

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
