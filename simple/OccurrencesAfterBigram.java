package simple;

import java.util.ArrayList;

public class OccurrencesAfterBigram {


    public static void main(String[] args)
    {
        OccurrencesAfterBigram.Solution solution = new OccurrencesAfterBigram.Solution();
        System.out.println(solution.findOcurrences("alice is a good girl she is a good student","a","good"));

    }

    static class Solution {
        public String[] findOcurrences(String text, String first, String second) {

            ArrayList<String> list = new ArrayList<>();
            String[] wordList = text.split("\\s+");
            for( int i =0;i<wordList.length-2;i++){

                if(wordList[i].equals(first) && wordList[i+1].equals(second)) list.add(wordList[i+2]);
            }



            String[] result = new String[list.size()];
            for(int i = 0; i < list.size(); i++){
                result[i] = list.get(i);
            }
            return result;
        }
    }
}
