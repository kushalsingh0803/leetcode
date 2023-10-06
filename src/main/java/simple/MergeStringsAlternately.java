package simple;

public class MergeStringsAlternately {

    public String solve(String word1, String word2) {
        MergeStringsAlternately.Solution solution = new MergeStringsAlternately.Solution();
        return solution.mergeAlternately(word1,word2);
    }


    class Solution {
        public String mergeAlternately(String word1, String word2) {
            StringBuilder result = new StringBuilder();

            int firstWordLength = word1.length();
            int secondWordLength = word2.length();
            int i = 0;
            for(;i < ((firstWordLength<secondWordLength)? firstWordLength:secondWordLength);i++){
                result.append(word1.charAt(i));
                result.append(word2.charAt(i));

            }

             if (i == firstWordLength && i < secondWordLength){
                 result.append(word2.substring(i));

             }else if (i == secondWordLength && i < firstWordLength) {
                 result.append(word1.substring(i));
             }
   return result.toString();
        }
    }
}
