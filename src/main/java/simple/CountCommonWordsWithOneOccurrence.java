package simple;

import java.util.HashMap;
import java.util.Map;

public class CountCommonWordsWithOneOccurrence {

    public int solve(String[] words1, String[] words2) {
        CountCommonWordsWithOneOccurrence.Solution solution = new CountCommonWordsWithOneOccurrence.Solution();
        return solution.countWords(words1, words2);
    }


    class Solution {
        public int countWords(String[] words1, String[] words2) {

            HashMap<String, Integer> words1Map
                    = new HashMap<String, Integer>();

            HashMap<String, Integer> words2Map
                    = new HashMap<String, Integer>();
            int result = 0;
            for (String word : words1) {
                if (words1Map.containsKey(word)) {


                    words1Map.put(word, words1Map.get(word) + 1);
                } else {


                    words1Map.put(word, 1);
                }
            }
            for (String word : words2) {
                if (words2Map.containsKey(word)) {


                    words2Map.put(word, words2Map.get(word) + 1);
                } else {


                    words2Map.put(word, 1);
                }
            }

            for (Map.Entry<String, Integer> entry : words1Map.entrySet()) {

                if (words2Map.containsKey(entry.getKey())) {

                    if ((words1Map.get(entry.getKey()) == 1) && (words2Map.get(entry.getKey()) == 1)) result++;
                }
            }
            return result;
        }
    }
}
