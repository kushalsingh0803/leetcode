package simple;

public class CheckWhetherTwoStringsareAlmostEquivalent {

    class Solution {
        public boolean checkAlmostEquivalent(String word1, String word2) {
            int[] count1 = new int[26];
            int[] count2 = new int[26];
            for(char ch : word1.toCharArray()) {
                count1[ch - 'a']++;
            }

            for(char ch : word2.toCharArray()) {
                count2[ch - 'a']++;
            }
            for( int i =0; i <count1.length;i++){

                if( Math.abs(count1[i]-count2[i]) > 3) return false;
            }
            return true;
        }
    }
}
