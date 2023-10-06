package simple;

import java.util.Stack;

public class BackspaceStringCompare {


    public static void main(String[] args)
    {
        BackspaceStringCompare.Solution solution = new BackspaceStringCompare.Solution();
        System.out.println(solution.backspaceCompare("abcd", "bbcd"));

    }

    static class Solution {
        public boolean backspaceCompare(String s, String t) {

            Stack<Character> ss = new Stack<>();
            Stack<Character> tt = new Stack<>();
            for(char ch: s.toCharArray()){
                if( ch !='#'){

                    ss.push(ch);
                }else {
                    if (ss.size() > 0)
                        ss.pop();
                }
            }


            for(char ch: t.toCharArray()){
                if( ch !='#'){

                    tt.push(ch);
                }else {
                    if (tt.size() > 0)
                        tt.pop();
                }
            }
            System.out.println(ss);
            System.out.println(tt);
            if(ss.size() != tt.size()) return false;

            while( ss.size()> 0){
               if (ss.pop() != tt.pop()) return false;

            }

            return true;
        }
    }
}
