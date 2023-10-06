package simple;

public class DIStringMatch {

    public int[] solve(String s) {
        DIStringMatch.Solution solution = new DIStringMatch.Solution();
        return solution.diStringMatch(s);
    }

    class Solution {
        public int[] diStringMatch(String s) {
            int n = s.length();
            int[] arr = new int[n+1];
            int start =0;
            int last = n;
            for(int i =0; i<n; i++){
                char currChar = s.charAt(i);
                if(currChar == 'I'){
                    arr[i] = start;
                    start++;
                } else{
                    arr[i] = last;
                    last--;
                }
            }
            arr[n] = last;

            return arr;
        }
    }
}
