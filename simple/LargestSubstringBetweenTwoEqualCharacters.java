package simple;

public class LargestSubstringBetweenTwoEqualCharacters {
    class Solution {
        public int maxLengthBetweenEqualCharacters(String s) {
         int result = 0;


            for(char ch='a'; ch<='z'; ch++) {
                result = Math.max(result, s.lastIndexOf(ch)-s.indexOf(ch));
            }
            return result == 0 ? -1 : result-1;
        }
    }
}
