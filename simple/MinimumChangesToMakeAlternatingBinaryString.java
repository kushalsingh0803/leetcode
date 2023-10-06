package simple;

public class MinimumChangesToMakeAlternatingBinaryString {
    public static void main(String[] args)
    {
        MinimumChangesToMakeAlternatingBinaryString.Solution solution = new MinimumChangesToMakeAlternatingBinaryString.Solution();
        System.out.println(solution.minOperations("101101111"));

    }

    static class Solution {
        public int minOperations(String s) {
            int count0=0, count1=0;
            int result = 0;
            for( int i =0;i<s.length();i+=2){


                if( s.charAt(i) != '0') count0++;
                if( i+1 <= s.length()-1 && s.charAt(i+1) != '1') count0++;
            }
            for( int i =0;i<s.length();i+=2){

                if( s.charAt(i) != '1') count1++;
                if(i+1 <= s.length()-1 && s.charAt(i+1) != '0') count1++;
            }

            return Math.min(count0,count1);
        }
    }
}
