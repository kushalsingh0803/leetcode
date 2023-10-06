package simple;

public class RotateString {


    public static void main(String[] args)
    {
        RotateString.Solution solution = new RotateString.Solution();
        System.out.println(solution.rotateString("abcde", "cdeab"));

    }
    static class Solution {
        public boolean rotateString(String s, String goal) {
          if ((s.charAt(0) == goal.charAt(0)) || ( s.length() != goal.length())) return false;

          for ( int i =1;i<s.length();i++){
              String ans = s.substring(i) + s.substring(0, i);

              if(ans.equals(goal)) return true;


          }
          return false;
        }
    }
}
