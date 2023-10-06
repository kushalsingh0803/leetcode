package simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class GoatLatin {

    public String solve(String sentence) {
        GoatLatin.Solution solution = new GoatLatin.Solution();
        return solution.toGoatLatin(sentence);
    }

    class Solution {
        public String toGoatLatin(String sentence) {

            StringBuilder result = new StringBuilder();

            Character[] vowel = {'a', 'e',  'i',  'o', 'u', 'A', 'E', 'I', 'O', 'U'};
            List<Character> vowelList = new ArrayList<Character>();
            vowelList.addAll(Arrays.asList(vowel));
            String[] wordList = sentence.split("\\s+");
            for (int i = 0; i < wordList.length; i++) {
                //sorted.put(wordList[i].substring(wordList[i].length() - 1), wordList[i].substring(0, wordList[i].length() - 1));

               if(vowelList.contains(wordList[i].charAt(0))) {
                   result.append(wordList[i]);
                   result.append("ma");
               }

               else {
                   char c = wordList[i].charAt(0);
                   result.append(wordList[i].substring(1));
                   result.append(c);
                   result.append("ma");

               }

                for(int j =0;j<=i;j++) {
                    result.append("a");
                }
                    result.append(" ");
                }



            return result.toString().trim();
            }

        }
    }



