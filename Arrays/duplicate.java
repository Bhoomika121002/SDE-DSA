// sort duplicacy of array

class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];  //initialy both starting position or 1st number 
        int fast = nums[0];
        do{
            slow = nums[slow]; //slow pointer moved by 1
            fast = nums[nums[fast]];
        }while(slow != fast);  //till both at same pointer 

        fast = nums[0];   // move fast to staring pos. 
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;

    }
}