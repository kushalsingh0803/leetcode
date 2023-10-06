package simple;

import java.util.HashMap;

public class WordPattern {

    public boolean solve(String pattern, String s) {
        WordPattern.Solution solution = new WordPattern.Solution();
        return solution.wordPattern(pattern,s);
    }



    class Solution {
        public boolean wordPattern(String pattern, String s) {

            HashMap<Character, String> indexMapping = new HashMap<>();

            String[] wordlist = s.split(" ");

            if (pattern.length() != wordlist.length)
            {
                return false;
            }
            for (int i = 0; i < wordlist.length; i++) {

                if (indexMapping.containsKey(pattern.charAt(i)) && !indexMapping.get(pattern.charAt(i)).equals(wordlist[i])) {

                    return false;
                }

                else if(!indexMapping.containsKey(pattern.charAt(i)) && indexMapping.containsValue(wordlist[i])) {

                    return false;
                }
                else {
                    indexMapping.put(pattern.charAt(i), wordlist[i]);
                }

            }
            return true;

        }
    }
}
