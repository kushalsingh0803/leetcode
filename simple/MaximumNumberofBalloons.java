package simple;

public class MaximumNumberofBalloons {


    public static void main(String[] args)
    {
        MaximumNumberofBalloons.Solution solution = new MaximumNumberofBalloons.Solution();
        System.out.println(solution.maxNumberOfBalloons("loonbalxballpoonballoo"));

    }
   static class Solution {
        public int maxNumberOfBalloons(String text) {

            int[] count = new int[26];
            for(char ch : text.toCharArray()) {
                count[ch - 'a']++;
            }

            int ans = Integer.MAX_VALUE;

            ans = Math.min(ans,count['a'-'a']);
            ans = Math.min(ans,count['b'-'a']);
            ans = Math.min(ans,count['n'-'a']);
            ans = Math.min(ans,count['l'-'a']/2);
            ans = Math.min(ans,count['o'-'a']/2);

            return ans;
        }
    }


}
