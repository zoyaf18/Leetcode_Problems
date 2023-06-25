class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (k <= 0 || head == null || head.next == null){
            return head;
        }

        ListNode pointer = head;
        int length = 1;
        while (pointer.next != null){
            pointer = pointer.next;
            length++;
        }

        pointer.next = head;
        int rotations = k % length;
        int skips = length-rotations;
        ListNode end = head;
        for (int i = 0; i < skips -1; i++){
            end = end.next;

        }
        head = end.next;
        end.next = null;
        return head;
    }
}
