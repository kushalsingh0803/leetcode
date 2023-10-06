package simple;

public class ValidPalindromeII {


    public static void main(String[] args)
    {
        ValidPalindromeII.Solution solution = new ValidPalindromeII.Solution();
        System.out.println(solution.validPalindrome("ececabbacec"));

    }

    static class Solution {
        public boolean validPalindrome(String s) {
            int st = 0;
            int e = s.length()-1;
            String str ="";
            while(st<e){
                if(s.charAt(st)==s.charAt(e)){
                    st++;
                    e--;
                }
                else return palindrome(s, st+1, e) || palindrome(s, st, e-1);

            }
            return true;
        }

        public boolean palindrome(String s,int i,int j){
            while(i<=j){
                if(s.charAt(i)!=s.charAt(j))
                    return false;
                i++;
                j--;
            }
            return true;
        }
    }
}
