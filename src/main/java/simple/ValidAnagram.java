package simple;
import java.util.HashMap;
import java.util.Map.Entry;

public class ValidAnagram {

    public boolean solve(String s, String t) {
        ValidAnagram.Solution solution = new ValidAnagram.Solution();
        return solution.isAnagram(s,t);
    }


    static class Solution {
        public boolean isAnagram(String s, String t) {


            if (s.length() != t.length())
            {
                return false;
            }

            HashMap<Character, Integer> charCountMapS
                    = new HashMap<Character, Integer>();

            HashMap<Character, Integer> charCountMapT
                    = new HashMap<Character, Integer>();

            char[] strArrayS = s.toCharArray();
            char[] strArrayT = t.toCharArray();

            for (char c : strArrayS) {
                if (charCountMapS.containsKey(c)) {


                    charCountMapS.put(c, charCountMapS.get(c) + 1);
                }
                else {


                    charCountMapS.put(c, 1);
                }
            }
            for (char c : strArrayT) {
                if (charCountMapT.containsKey(c)) {


                    charCountMapT.put(c, charCountMapT.get(c) + 1);
                }
                else {


                    charCountMapT.put(c, 1);
                }
            }

            for (Entry<Character, Integer> entry : charCountMapS.entrySet()) {

                if (charCountMapT.containsKey(entry.getKey())) {

                    if(!charCountMapT.get(entry.getKey()).equals(charCountMapS.get(entry.getKey()))) {

                        return false;
                    }


                }
                else {

                    return false;
                }

            }

            return true;

        }
    }

}
