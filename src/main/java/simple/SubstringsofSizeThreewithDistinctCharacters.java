package simple;

public class SubstringsofSizeThreewithDistinctCharacters {


    public static void main(String[] args)
    {
        SubstringsofSizeThreewithDistinctCharacters.Solution solution = new SubstringsofSizeThreewithDistinctCharacters.Solution();
        System.out.println(solution.countGoodSubstrings("aababcabc"));

    }

    static class Solution {
        public int countGoodSubstrings(String s) {

         int result = 0;
            System.out.println ( s.length());
         for ( int i = 0;i<=s.length()-3;i++){
             System.out.println ( i);
             String word = s.substring(i,i+3);
             System.out.println ( word);
             if(word.charAt(0) != word.charAt(1) && word.charAt(0) != word.charAt(2) && word.charAt(1) != word.charAt(2)) result ++;

         }

return  result;
        }
    }
}
