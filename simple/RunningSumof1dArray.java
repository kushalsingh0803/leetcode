package simple;

public class RunningSumof1dArray {

    class Solution {
        public int[] runningSum(int[] nums) {
         int[] result = new int[nums.length];
         int res =0;
         for ( int i =0;i<nums.length;i++){
             res = res +nums[i];
             result[i] = res;

            }
         return result;
        }
    }
}
