package simple;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

    class Solution {
        public int longestPalindrome(String s) {
            int total =0;
            HashMap<Character,Integer> count = new HashMap<>();

            for(Character c: s.toCharArray()){
                if(count.containsKey(c)){
                    count.put(c,count.get(c)+1);

                }else{
                    count.put(c,1);
                }
            }
            boolean first3Letter = false;
            for (Map.Entry<Character,Integer> entry : count.entrySet()){
                total+=entry.getValue();
                if(entry.getValue()%2!=0){
                    total-=1;
                    first3Letter = true;
                }
            }
            return first3Letter? total+1:total;
        }
    }

}
