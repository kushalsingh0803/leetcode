package easy;


import java.util.List;

public class StringIsAcronymWords {

    public boolean solve(List<String> words, String s) {
        StringIsAcronymWords.Solution solution = new StringIsAcronymWords.Solution();
        return solution.isAcronym(words,s);
    }

    class Solution {
        public boolean isAcronym(List<String> words, String s) {

            StringBuilder t = new StringBuilder();

            for(int i=0;i<words.size();i++){
                t=t.append(words.get(i).charAt(0));

            }

            return  t.toString().equals(s)?true:false;


        }
    }
}
