// sort 0'2, 1's, 2's


class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;  //because arrys start with 0
        int mid = 0;
        int temp; //swap needs
        while (mid <= high) {     //iteration till mid doesn't crosss high
            switch (nums[mid]) {    // number at mid
                case 0: {
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
                }


            }

        }

    }
}