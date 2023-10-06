package simple;

import java.util.HashMap;
import java.util.Map;

public class FindWordsThatCanBeFormedbyCharacters {

    class Solution {
        public int countCharacters(String[] words, String chars) {
            int result = 0;
            Map<Character, Integer> sourceMap = new HashMap<>();

            for(int i = 0; i<chars.length(); i++)
            {
                sourceMap.put(chars.charAt(i),sourceMap.getOrDefault(chars.charAt(i),0)+1);
            }



            for(String s: words)
            {
                Map<Character, Integer> wordMap = new HashMap<>();
                boolean matchALlChar = true;
                for(int i = 0; i<s.length(); i++)
                {
                    wordMap.put(s.charAt(i),wordMap.getOrDefault(s.charAt(i),0)+1);
                }
                int j =0;
                while(j<s.length())
                {
                    if(sourceMap.containsKey(s.charAt(j)) && wordMap.containsKey(s.charAt(j)))
                    {
                        if(sourceMap.get(s.charAt(j)) < wordMap.get(s.charAt(j)))
                        {
                            matchALlChar = false;
                            break;
                        }
                    }
                    else
                    {
                        matchALlChar = false;
                        break;
                    }
                    j++;
                }
                if(matchALlChar)
                    result += s.length();

            }

            return result;






        }
    }

}
