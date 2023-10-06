package simple;

public class CheckIfStringIsaPrefixofArray {


    public static void main(String[] args)
    {
        CheckIfStringIsaPrefixofArray.Solution solution = new CheckIfStringIsaPrefixofArray.Solution();
        System.out.println(solution.isPrefixString("dddddddddddd",
                new String[]  {"dd","ddd"}));

    }

   static class Solution {
        public boolean isPrefixString(String s, String[] words) {

            int i =0;

            for ( int j =0;j<s.length() ;j++){
                if (i >= words.length) return false;
                if (s.substring(j).length() < words[i].length()) return false;
                if (!s.substring(j,j+words[i].length()).equals(words[i])) return false;
                j= j+words[i].length() -1;
                i++;
            }
            return true;
        }
    }
}
