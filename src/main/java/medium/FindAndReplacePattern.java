package medium;

import easy.RemoveTrailingZerosFromString;

import java.util.ArrayList;
import java.util.List;

public class FindAndReplacePattern {

    public List<String> solve(String[] words, String pattern) {
        FindAndReplacePattern.Solution solution = new FindAndReplacePattern.Solution();
        return solution.findAndReplacePattern(words,pattern);
    }

    class Solution {
        public List<String> findAndReplacePattern(String[] words, String pattern) {
            List<String> res = new ArrayList<>();
            boolean patternFound;
            for (String word : words) {
                patternFound = true;
                for (int i=0;i<word.length();i++){
                    if(word.indexOf(word.charAt(i)) != pattern.indexOf(pattern.charAt(i)) ) patternFound = false;
                }
                if (patternFound) res.add(word);
            }
            return res;
        }
    }
}
