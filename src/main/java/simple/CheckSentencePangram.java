package simple;

import java.util.ArrayList;
import java.util.List;

public class CheckSentencePangram {

    public boolean solve(String sentence) {
        CheckSentencePangram.Solution solution = new CheckSentencePangram.Solution();
        return solution.checkIfPangram(sentence);
    }

    class Solution {
        public boolean checkIfPangram(String sentence) {

            List<Character> uniqueChar = new ArrayList<>();
            for (int i = 0; i < sentence.length(); i++){

                if (!uniqueChar.contains(sentence.charAt(i))){
                    uniqueChar.add(sentence.charAt(i));
                }
            }

            return uniqueChar.size() == 26 ;
        }
    }
}
