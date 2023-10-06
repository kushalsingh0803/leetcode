package simple;

import java.util.Stack;

public class MinimumAddtoMakeParenthesesValid {



    class Solution {
        public int minAddToMakeValid(String s) {
            Stack<Character> st = new Stack();

        for( int i =0;i<s.length();i++){

          if(st.empty()) st.push(s.charAt(i));
          else if ( s.charAt(i) ==')' && st.peek() == '(') st.pop();
          else st.push(s.charAt(i));

        }
        return st.size();
        }
    }
}
