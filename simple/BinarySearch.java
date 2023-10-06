package simple;

public class BinarySearch {

    class Solution {
        public int search(int[] nums, int target) {
            if(nums==null || nums.length==0) return -1;
            int leftIndex=0,rightIndex=nums.length-1;
            while(leftIndex<=rightIndex){
                int midIndex =leftIndex+(rightIndex-leftIndex)/2;
                if(nums[midIndex]==target)
                    return midIndex;
                if(nums[midIndex]>target)
                    rightIndex=midIndex-1;
                else
                    leftIndex=midIndex+1;
            }
            return -1;
        }
    }

}
