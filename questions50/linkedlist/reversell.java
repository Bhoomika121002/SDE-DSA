package questions50.linkedlist;

public class reversell {
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode newHead =  null;
            while(head != null){
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }}
    
}
