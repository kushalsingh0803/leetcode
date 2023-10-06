package simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentWords {

    class Solution {
        public List<String> topKFrequent(String[] words, int k) {
             Map<String, Integer> wordFrequencyMap = new HashMap<>();
            List<String> result = new ArrayList<>();
            for(String word : words) {
                int frequency = wordFrequencyMap.getOrDefault(word, 0);
                wordFrequencyMap.put(word, frequency + 1);
            }


            return result;
        }
    }
}
