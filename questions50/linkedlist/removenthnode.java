package questions50.linkedlist;

public class removenthnode {
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode start = new ListNode();   //dummy node created 
            start.next = head;
            ListNode fast = start;
            ListNode slow = start;
    
            for(int i =0; i<n; i++){
                fast = fast.next; 
            }
    
            while (fast.next != null){
                fast = fast.next;
                slow = slow.next;
            }
    
            slow.next = slow.next.next; 
            return start.next; 
    
        }
    }
    
}
