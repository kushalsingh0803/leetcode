package simple;

public class LongestCommonPrefix {
    public String solve(String[] args) {
        Solution solution = new Solution();
        return solution.longestCommonPrefix(args);
    }

    class Solution {
        public String longestCommonPrefix(String[] strs) {

            if (strs.length == 0) {
                return "";
            }
            if (strs.length == 1) {
                return strs[0];
            }




            StringBuilder resultBuilder =  new StringBuilder();
            for (int i=0;i<strs[0].length();i++) {
                char ithCharacter = strs[0].charAt(i);
                for (int j=1;j<strs.length;j++) {
                    if (strs[j].length() < (i+1)) {
                        return resultBuilder.toString();
                    }
                    if (ithCharacter != strs[j].charAt(i))
                    {
                        return resultBuilder.toString();
                    }
                }
                resultBuilder.append(ithCharacter);
            }


            return resultBuilder.toString();
        }
    }



}
