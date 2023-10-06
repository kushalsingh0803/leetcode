package simple;

import java.util.HashMap;
import java.util.List;

public class EvaluatetheBracketPairsofaString {

    class Solution {
        public String evaluate(String s, List<List<String>> knowledge) {
            StringBuilder result= new StringBuilder();
            HashMap<String,String> map= new HashMap<>();
            for(List<String> list: knowledge){
                map.put(list.get(0), list.get(1));
            }

            int index=0;
            for (int i = 0; i < s.length(); i++)
            {
                if (s.charAt(i)=='(')
                {
                    result.append(s.substring(index, i));
                    index=i+1;
                }
                else if (s.charAt(i)==')')
                {
                    result.append( map.get(s.substring(index, i)) != null? map.get(s.substring(index, i)) : "?");
                    index=i+1;
                }
            }
            result.append(s.substring(index));
            return result.toString();

        }
    }
}
