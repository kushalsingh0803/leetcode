package simple;

import java.util.Stack;

public class RemoveOutermostParentheses {

    class Solution {
        public String removeOuterParentheses(String s) {
            Stack<Character> st = new Stack<>();
            String result = "";

            for (char ch : s.toCharArray()) {
                if (ch == '(') {
                    if (st.size() > 0) result += ch;
                    st.push(ch);
                }

                if (ch == ')') {

                    st.pop();
                    if (st.size() > 0) result += ch;
                }


            }
            return result;
        }
    }
}