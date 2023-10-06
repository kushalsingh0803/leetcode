package simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MaxNumofWordsFoundinSentences {

    public int solve(String[] sentences) {
        MaxNumofWordsFoundinSentences.Solution solution = new MaxNumofWordsFoundinSentences.Solution();
        return solution.mostWordsFound(sentences);
    }

    class Solution {
        public int mostWordsFound(String[] sentences) {

            int maxNumber = 0;

            for (String sentence : sentences){

                int currentWordLength = sentence.trim().split("\\s+").length;

                if ( currentWordLength > maxNumber) maxNumber = currentWordLength;
            }

            return  maxNumber;
        }
    }

}
