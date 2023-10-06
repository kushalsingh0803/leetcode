package simple;


import java.util.Map;
import java.util.TreeMap;

public class SortingtheSentence {

    public String solve(String s) {
        SortingtheSentence.Solution solution = new SortingtheSentence.Solution();
        return solution.sortSentence(s);
    }

    class Solution {
        public String sortSentence(String s) {

            StringBuilder result = new StringBuilder();
            TreeMap<String, String> sorted
                    = new TreeMap<>();
            String[] wordList = s.split("\\s+");

            for (int i = 0; i < wordList.length; i++) {
                sorted.put(wordList[i].substring(wordList[i].length() - 1), wordList[i].substring(0, wordList[i].length() - 1));
            }

            for (Map.Entry<String, String> entry : sorted.entrySet()) {

                result.append(entry.getValue());
                result.append(" ");
            }
            return result.toString().trim();
        }
    }
}
