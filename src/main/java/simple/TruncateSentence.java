package simple;

public class TruncateSentence {

    public String solve(String s, int k) {
        TruncateSentence.Solution solution = new TruncateSentence.Solution();
        return solution.truncateSentence(s,k);
    }


    class Solution {
        public String truncateSentence(String s, int k) {


            String[] wordList = s.split("\\s+");
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < k; i++) {
                result.append(wordList[i]);
                result.append(" ");
            }

            return result.toString().trim();
        }
    }
}
