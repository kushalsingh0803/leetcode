package simple;

public class NumberStringsAppearSubstringsWord {


    public int solve(String[] patterns, String word) {
        NumberStringsAppearSubstringsWord.Solution solution = new NumberStringsAppearSubstringsWord.Solution();
        return solution.numOfStrings(patterns,word);
    }


    class Solution {
        public int numOfStrings(String[] patterns, String word) {

            int result = 0;

            for (int i = 0; i<patterns.length;i++){

                if(word.contains(patterns[i])) result++;
            }

            return result;
        }
    }
}
