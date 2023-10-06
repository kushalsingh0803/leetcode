package simple;

public class TwoStringArraysareEquivalent {

    public boolean solve(String[] word1, String[] word2) {
        TwoStringArraysareEquivalent.Solution solution = new TwoStringArraysareEquivalent.Solution();
        return solution.arrayStringsAreEqual(word1, word2);
    }

    class Solution {
        public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

            StringBuilder completeWord1 = new StringBuilder();
            StringBuilder completeWord2 = new StringBuilder();

            for ( int i = 0; i<word1.length;i++){

                completeWord1.append(word1[i]);
            }
            for ( int i = 0; i<word2.length;i++){

                completeWord2.append(word2[i]);
            }

            return completeWord1.toString().equals(completeWord2.toString());
        }
    }
}
