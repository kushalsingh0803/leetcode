package simple;

import java.util.HashSet;
import java.util.Set;

public class LongestNiceSubstring {

    class Solution {
        public String longestNiceSubstring(String s) {
            String maxSubstring = "";

            for (int i = 0; i < s.length() - 1; i++) {
                for (int j = i + 1; j < s.length(); j++) {
                    String sub = s.substring(i, j + 1);
                    boolean checkNice = CheckNice(sub);

                    if (checkNice && sub.length() > maxSubstring.length()) {
                        maxSubstring = sub;
                    }
                }
            }

            return maxSubstring;
        }


        public boolean CheckNice(String sub) {
            Set<Character> charSet = new HashSet<>();

            boolean check = true;

            for (int i = 0; i < sub.length(); i++) {
                charSet.add(sub.charAt(i));
            }

            for (char ch : charSet) {
                if (Character.isUpperCase(ch)) {
                    if (!charSet.contains(Character.toLowerCase(ch))) {
                        check = false;
                    }
                }
                if (Character.isLowerCase(ch)) {
                    if (!charSet.contains(Character.toUpperCase(ch))) {
                        check = false;
                    }
                }


            }
            return check;


        }
    }
}
