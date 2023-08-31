package questions50.linkedlist;

public class middleelement {
    public static void main(String[] args) {
        class Solution {
            public startpoint middleNode(startpoint head) {
                startpoint slow = head; 
                startpoint fast = head; 
                while(fast != null && fast.next != null ){
                    slow = slow.next;
                    fast = fast.next.next;
                }
                return slow;
            }
        }
    }
    
}
