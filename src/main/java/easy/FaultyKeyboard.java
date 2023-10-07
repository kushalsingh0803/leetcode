package easy;

import java.util.List;

public class FaultyKeyboard {


    public String solve(String s) {
        FaultyKeyboard.Solution solution = new FaultyKeyboard.Solution();
        return solution.finalString(s);
    }

    class Solution {
        public String finalString(String s) {

            StringBuilder sb = new StringBuilder(s.length());
            for (char c : s.toCharArray())
                if (c == 'i')  sb.reverse();  else  sb.append(c);
            return sb.toString();

        }
    }
}
