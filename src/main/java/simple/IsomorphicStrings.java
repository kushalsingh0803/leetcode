package simple;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings {

    public boolean solve(String s, String t) {
        IsomorphicStrings.Solution solution = new IsomorphicStrings.Solution();
        return solution.isIsomorphic(s,t);
    }


    class Solution {
        public boolean isIsomorphic(String s, String t) {
            HashMap<Character, Character> indexMapping = new HashMap<>();



            if (s.length() != t.length())
            {
                return false;
            }
            for (int i = 0; i < s.length(); i++) {

                if (indexMapping.containsKey(s.charAt(i)) && indexMapping.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }

                else if(!indexMapping.containsKey(s.charAt(i)) && indexMapping.containsValue(t.charAt(i))) {

                    return false;
                }
                else {
                    indexMapping.put(s.charAt(i), t.charAt(i));
                }

            }
            return true;
        }
    }

}




