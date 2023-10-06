package simple;

import java.util.Stack;

public class MaximumNestingDepthoftheParentheses {
    public static void main(String[] args)
    {
        MaximumNestingDepthoftheParentheses.Solution solution = new MaximumNestingDepthoftheParentheses.Solution();
        System.out.println(solution.maxDepth("(1+(2*3)+((8)/4))+1"));

    }

    static class Solution {
        public int maxDepth(String s) {
            Stack<Character> st = new Stack<>();
            int result =0;
            for(char ch: s.toCharArray()){
                if( ch =='('){

                        st.push(ch);
                    }

            if( ch ==')'){
                result = Math.max(result,st.size());
                st.pop();
            }
        }
         return result;
            }
        }

}
