package simple;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {

    class Solution {
        public int characterReplacement(String s, int k) {
            Map<Character, Integer> charFreqMap = new HashMap<>();
            int maxLength = 0;
            int start =0;
            int maxRepeatCount = 0;
            for (int i = 0; i < s.length(); i++) {

                char c = s.charAt(i);

                charFreqMap.put(c, charFreqMap.getOrDefault(c, 0) + 1);

                maxRepeatCount = Math.max(maxRepeatCount, charFreqMap.get(c));

                int currLen = i - start + 1;

                if (currLen - maxRepeatCount > k) {
                    c = s.charAt(start);
                    charFreqMap.put(c, charFreqMap.get(c) - 1);
                    start++;
                }


                maxLength = Math.max(maxLength, i - start + 1);
            }

            return  maxLength;
        }
    }
}
