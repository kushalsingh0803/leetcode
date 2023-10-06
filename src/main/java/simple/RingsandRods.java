package simple;

import java.util.HashMap;
import java.util.HashSet;

public class RingsandRods {


    class Solution {
        public int countPoints(String rings) {

            HashMap<Character, HashSet<Character>> hm = new HashMap<Character, HashSet<Character>>();
            int result=0;
           for(int i = 0;i<rings.length();i=i+2)
            {
                Character d = rings.charAt(i);
                if( ! hm.containsKey(rings.charAt(i+1))){
                   hm.put(rings.charAt(i+1),new HashSet<>()) ;
                }
                hm.get(rings.charAt(i+1)).add(d);


            }
            for(HashSet<Character> set: hm.values()) {


                if (set.size() == 3) result++;

            }
            return result;
        }
    }
}
