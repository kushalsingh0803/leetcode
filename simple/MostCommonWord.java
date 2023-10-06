package simple;

import java.util.*;

public class MostCommonWord {

    public static void main(String[] args)
    {
        MostCommonWord.Solution solution = new MostCommonWord.Solution();
        System.out.println(solution.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit." ,new String[] {"hit"}));

    }

    static class Solution {
        public String mostCommonWord(String paragraph, String[] banned) {

            List<String> bannedList = new ArrayList<>(Arrays.asList(banned));
            HashMap<String, Integer> wordsMap
                    = new HashMap<String, Integer>();
            for(String word : paragraph.toLowerCase().replaceAll("[^A-Za-z0-9\\s,]","").split(("\\W+"))){

               word= word.trim();

                if (wordsMap.containsKey(word)) {
                    wordsMap.put(word, wordsMap.get(word) + 1);
                } else {
                    wordsMap.put(word, 1);
                }
            }
            int max = 0;
            String result = "";
            for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {

                   if ( max < wordsMap.get(entry.getKey()) && !bannedList.contains(entry.getKey())){
                       max = wordsMap.get(entry.getKey());
                       result = entry.getKey();

                }
            }
            return result;
        }
    }
}
