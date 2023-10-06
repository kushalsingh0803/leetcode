package simple;

import java.util.Arrays;

public class MinimumNumberofStepstoMakeTwoStringsAnagramII {


    public static void main(String[] args)
    {
        MinimumNumberofStepstoMakeTwoStringsAnagramII.Solution solution = new MinimumNumberofStepstoMakeTwoStringsAnagramII.Solution();
        System.out.println(solution.minSteps("nxkhahxvqy"
                ,"nbhqyoxwnx"));

    }

    static class Solution {
        public int minSteps(String s, String t) {
            int[] sChar = new int[26];
            int[] tChar = new int[26];
            for(char c : s.toCharArray()){
                sChar[c-'a']++;
            }
            for(char c : t.toCharArray()){
                tChar[c-'a']++;
            }
            int res =0;

            for ( int i =0; i < 26; i++){


                if (sChar[i]!=0 || tChar[i] !=0) {
                    res =res+Math.abs(tChar[i]-sChar[i]);

                }




            }
            return res;
        }
    }
}
