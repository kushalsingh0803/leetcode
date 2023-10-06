package simple;

public class MaximumRepeatingSubstring {
    class Solution {
        public int maxRepeating(String sequence, String word) {
            String text = word;
            int count = 0;
            while(sequence.contains(text)){
                count++;
                text+=word;
            }
            return count;
        }
    }
}
