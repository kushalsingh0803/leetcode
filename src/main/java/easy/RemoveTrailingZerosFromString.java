package easy;

public class RemoveTrailingZerosFromString {

    public String solve(String s) {
        RemoveTrailingZerosFromString.Solution solution = new RemoveTrailingZerosFromString.Solution();
        return solution.removeTrailingZeros(s);
    }

    class Solution {
        public String removeTrailingZeros(String num) {
           int i = num.length();

           while( num.charAt(i-1) == '0' ) {
               i--;

           }

           return num.substring(0,i);
        }
    }
}
