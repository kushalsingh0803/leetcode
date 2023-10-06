package simple;

import java.util.Stack;

public class MaximumNestingDepthofTwoValidParenthesesStrings {

    class Solution {
        public int[] maxDepthAfterSplit(String seq) {
            int[] arr = new int[seq.length()];

            Stack st1 = new Stack();
            Stack st2 = new Stack();
            for(int i=0;i<seq.length();i++)
            {
                if(seq.charAt(i)=='(')
                {
                    if(st1.size()<=st2.size())
                    {
                        st1.push('(');
                        arr[i]=0;

                    }
                    else
                    {
                        st2.push('(');
                        arr[i]=1;

                    }
                }


                if(seq.charAt(i)==')')
                {
                    if(st1.size()>=st2.size())
                    {
                        st1.pop();
                        arr[i]=0;

                    }
                    else
                    {
                        st2.pop();
                        arr[i]=1;

                    }

                }
            }

            return arr;

        }
    }

}
