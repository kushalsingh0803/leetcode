package simple;

public class LengthOfLastWord {

    public int solve(String s) {
        LengthOfLastWord.Solution solution = new LengthOfLastWord.Solution();
        return solution.lengthOfLastWord(s);
    }

    class Solution {
        public int lengthOfLastWord(String s) {
            int wordLength = 0;

            String x = s.trim();

            for (int i = 0; i < x.length(); i++) {
                if (x.charAt(i) == ' ')
                    wordLength = 0;
                else
                    wordLength++;
            }

            return wordLength;
        }
    }
}
