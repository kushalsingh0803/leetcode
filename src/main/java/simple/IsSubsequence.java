package simple;

public class IsSubsequence {


    public boolean solve(String s, String t) {
        IsSubsequence.Solution solution = new IsSubsequence.Solution();
        return solution.isSubsequence(s,t);
    }

    class Solution {
        public boolean isSubsequence(String s, String t) {

            int charFound = 0;
             int j = 0;
            for( int i = 0; i <s.length();i++){

                char c = s.charAt(i);
                        while ( j < t.length()){
                            if (c==t.charAt(j)){

                                charFound++;
                                j++;
                                break;

                            }
                            else {
                                j++;
                            }


                        }


            }


            if(charFound < s.length()){
                return  false;
            }
            return true;
        }
    }

}
