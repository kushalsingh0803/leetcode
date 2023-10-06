package simple;

import java.util.HashMap;

public class BullsandCows {

    class Solution {
        public String getHint(String secret, String guess) {

            HashMap<Character,Integer> seen=new HashMap<>();
            int bull=0;
            int cow=0;
            for(int i=0;i<secret.length();i++)
            {
                char s=secret.charAt(i);
                char g=guess.charAt(i);
                if(s==g)
                    bull++;
                else
                {
                    seen.put(s,seen.getOrDefault(s,0)+1);
                }
            }
            for(int i=0;i<guess.length();i++)
            {
                char s=secret.charAt(i);
                char g=guess.charAt(i);
                if(s!=g && seen.getOrDefault(g,0)>0)
                {
                    cow++;
                    seen.put(g,seen.get(g)-1);
                }
            }
            return bull+"A"+cow+"B";
        }
    }
}
