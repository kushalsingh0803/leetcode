package simple;

public class ImplementstrStr {

    public int solve(String haystack, String needle) {
        ImplementstrStr.Solution solution = new ImplementstrStr.Solution();
        return solution.strStr(haystack,needle);
    }

    class Solution {
        public int strStr(String haystack, String needle) {
            if (needle.length()==0){
                return 0;
            }
            for(int i = 0; i<haystack.length(); i++)
            {
                if(haystack.charAt(i) == needle.charAt(0))
                {
                    int cnt = 0;
                    for(int j = 0; j<needle.length() && i+j<haystack.length(); j++)
                    {
                        if(haystack.charAt(i+j) == needle.charAt(j))
                        {
                            cnt++;
                        }
                    }
                    if(cnt == needle.length())
                    {
                        return i;
                    }
                }
            }

            return -1;
        }
    }
}
