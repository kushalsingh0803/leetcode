package simple;

public class FindtheDifference {

    public char solve(String s, String t) {
        FindtheDifference.Solution solution = new FindtheDifference.Solution();
        return solution.findTheDifference(s,t);
    }

    class Solution {
        public char findTheDifference(String s, String t) {

            int sum =0;
            for ( int i =0;i<s.length();i++){

                sum = sum + (t.charAt(i)-'a') - (s.charAt(i) - 'a');

            }
            sum = sum + ( t.charAt(t.length()-1) -'a');

            return (char)(sum +'a');
        }
    }
}
