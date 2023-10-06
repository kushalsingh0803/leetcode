package simple;

public class ConsecutiveCharacters {


    public static void main(String[] args)
    {
        ConsecutiveCharacters.Solution solution = new ConsecutiveCharacters.Solution();
        System.out.println(solution.maxPower("leetcode"));

    }

    static class Solution {
        public int maxPower(String s) {
            int result = 1;
            int j =1;

            for ( int i =1;i<s.length();i++){
                if (s.charAt(i) == s.charAt(i-1)){
                    j++;
                }
                else {
                    result = Math.max(result,j);
                    j=1;
                }
                if ( i==s.length()-1) {
                    result = Math.max(result, j);
                    j = 1;
                }

            }
            return result;
        }
    }
}
