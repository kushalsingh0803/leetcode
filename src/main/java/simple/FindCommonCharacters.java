package simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonCharacters {

    public List<String> solve(String[] words) {
        FindCommonCharacters.Solution solution = new FindCommonCharacters.Solution();
        return solution.commonChars(words);

    }

    class Solution {
        public List<String> commonChars(String[] words) {

            int[] commonChars = new int[26];

            List<String> resultList = new ArrayList<>();
            String firstWord= words[0];

            for (int i =0;i<firstWord.length();i++){

                commonChars[firstWord.charAt(i)-'a']++;

                }

            for (int i =0;i<26;i++) {

                for (int j = 1; j < words.length; j++) {

                    int[] wordChars = new int[26];
                    for (char ch : words[j].toCharArray()) {
                        wordChars[ch - 'a']++;
                    }
                    commonChars[i] = Math.min(commonChars[i],wordChars[i]);
                }


            }

            for (int i =0;i<26;i++) {

                if(commonChars[i]!=0){

                    for ( int j =0; j<commonChars[i];j++)

                        resultList.add("" + (char)(i+97));
                }
            }
            return resultList;
        }
    }

}
