package simple;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public boolean solve(String s, String t) {
        RansomNote.Solution solution = new RansomNote.Solution();
        return solution.canConstruct(s,t);
    }

    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {

            HashMap<Character, Integer> ransomNoteMap
                    = new HashMap<Character, Integer>();

            HashMap<Character, Integer> magazineMap
                    = new HashMap<Character, Integer>();

            char[] ransomNoteArray = ransomNote.toCharArray();
            char[] magazineArray = magazine.toCharArray();

            for (char c : ransomNoteArray) {
                if (ransomNoteMap.containsKey(c)) {


                    ransomNoteMap.put(c, ransomNoteMap.get(c) + 1);
                }
                else {


                    ransomNoteMap.put(c, 1);
                }
            }
            for (char c : magazineArray) {
                if (magazineMap.containsKey(c)) {


                    magazineMap.put(c, magazineMap.get(c) + 1);
                }
                else {


                    magazineMap.put(c, 1);
                }
            }

            for (Map.Entry<Character, Integer> entry : ransomNoteMap.entrySet()) {

                if (magazineMap.containsKey(entry.getKey())) {

                    if( ransomNoteMap.get(entry.getKey()) > (magazineMap.get(entry.getKey()))) {

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
