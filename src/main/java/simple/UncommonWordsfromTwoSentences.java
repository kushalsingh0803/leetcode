package simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonWordsfromTwoSentences {

    class Solution {
        public String[] uncommonFromSentences(String s1, String s2) {
            HashMap<String, Integer> words1Map
                    = new HashMap<String, Integer>();

            HashMap<String, Integer> words2Map
                    = new HashMap<String, Integer>();
            List<String> wordList = new ArrayList<>();
            for (String word : s1.split("\\s+") ){
                if (words1Map.containsKey(word)) {


                    words1Map.put(word, words1Map.get(word) + 1);
                } else {


                    words1Map.put(word, 1);
                }
            }
            for (String word : s2.split("\\s+")) {
                if (words2Map.containsKey(word)) {


                    words2Map.put(word, words2Map.get(word) + 1);
                } else {


                    words2Map.put(word, 1);
                }
            }

            for (Map.Entry<String, Integer> entry : words1Map.entrySet()) {

                if ((words1Map.get(entry.getKey()) == 1)  && ! words2Map.containsKey(entry.getKey())) {

                    wordList.add(entry.getKey());
                }
            }
            for (Map.Entry<String, Integer> entry : words2Map.entrySet()) {

                if ((words2Map.get(entry.getKey()) == 1)  && ! words1Map.containsKey(entry.getKey())) {

                    wordList.add(entry.getKey());
                }
            }
            String[] ans = new String[wordList.size()];
            int i = 0;
            for(String str : wordList) ans[i++] = str;
            return ans;

        }
    }
}
