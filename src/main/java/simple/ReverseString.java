package simple;

public class ReverseString {


    public void solve(char[] s) {
        ReverseString.Solution solution = new ReverseString.Solution();
        solution.reverseString(s);
    }


    class Solution {
        public void reverseString(char[] s) {

            int i =0;
            int j = s.length-1;
            while (i<j){

                char tmp = s[i];
                s[i] = s[j];
                s[j] = tmp;
                i++;
                j--;
            }
        }
    }
}
