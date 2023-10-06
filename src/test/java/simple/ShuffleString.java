package simple;

import java.util.Map;
import java.util.TreeMap;

public class ShuffleString {


    public String solve(String s, int[] indices) {
        ShuffleString.Solution solution = new ShuffleString.Solution();
        return solution.restoreString(s,indices);
    }

    class Solution {
        public String restoreString(String s, int[] indices) {
            TreeMap<Integer, String> sorted
                    = new TreeMap<>();
                StringBuilder result =  new StringBuilder();
            for ( int i =0; i<s.length() ;i++){
                sorted.put(indices[i],s.substring(i,i+1));

            }
            for (Map.Entry<Integer, String> entry : sorted.entrySet()){

                result.append(entry.getValue());
            }
        return result.toString();
        }
    }
}
