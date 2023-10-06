package simple;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {

    public static void main(String[] args)
    {
        RemoveAllAdjacentDuplicatesInString.Solution solution = new RemoveAllAdjacentDuplicatesInString.Solution();
        System.out.println(solution.removeDuplicates("abbaca"));

    }

    static class Solution {
        public String removeDuplicates(String s) {
            Stack<Character> st = new Stack<>();

            for(char ch: s.toCharArray()){
                if(st.empty()){
                    st.push(ch);
                }
                else if(st.peek() == ch){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }

            String ans = "";
            while(!st.empty()){
                ans = st.pop() + ans;
            }


            return ans;
        }
    }
}
