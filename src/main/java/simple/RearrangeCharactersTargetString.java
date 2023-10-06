package simple;

public class RearrangeCharactersTargetString {


    public int solve(String s, String target) {
        RearrangeCharactersTargetString.Solution solution = new RearrangeCharactersTargetString.Solution();
        return solution.rearrangeCharacters(s,target);
    }

    class Solution {
        public int rearrangeCharacters(String s, String target) {

            int[] targetchar = new int[26];
            int[] inputchar = new int[26];
            for(char c : s.toCharArray()){
                inputchar[c-'a']++;
            }
            for(char c : target.toCharArray()){
                targetchar[c-'a']++;
            }

            int maxCount = Integer.MAX_VALUE;
            for ( int i =0; i < 26; i++){

                if (targetchar[i]==0) continue;

                maxCount = Math.min( inputchar[i]/targetchar[i], maxCount);


            }

            return maxCount;
        }
    }
}
