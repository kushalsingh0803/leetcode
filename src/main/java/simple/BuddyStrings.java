package simple;

import java.util.HashMap;
import java.util.Map;

public class BuddyStrings {


    class Solution {
        public boolean buddyStrings(String s, String goal) {


            if (s.length() != goal.length()) { return false; }

           int[] countChar = new int[26];
            int first = -1;
            int second = -1;

            if (s.equals(goal)) {
                for (int i = 0; i < s.length(); i++) {
                    countChar[s.charAt(i) - 'a']++;

                    if ( countChar[s.charAt(i) - 'a'] > 1 ) {
                        return true;
                    }

                }
            }

            for (int i = 0; i < s.length(); i++) {

                if(s.charAt(i) != goal.charAt(i)) {


                    if ( first == -1 ) {
                        first = i;
                    } else if ( second == -1 ) {
                        second = i;
                    } else {
                        return false;
                    }
                }
            }


            return (second != -1 && s.charAt(first) == goal.charAt(second) &&
                    s.charAt(second) == goal.charAt(first));
            }
    }
}
