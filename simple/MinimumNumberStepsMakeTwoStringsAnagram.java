package simple;

public class MinimumNumberStepsMakeTwoStringsAnagram {

    public static void main(String[] args)
    {
        MinimumNumberStepsMakeTwoStringsAnagram.Solution solution = new MinimumNumberStepsMakeTwoStringsAnagram.Solution();
        System.out.println(solution.minSteps("mn","op"));

    }

    static class Solution {
        public  int minSteps(String s, String t) {

            int[] source = new int[26];
            int[] target = new int[26];
            for( int i =0;i<s.length();i++){
                source[s.charAt(i)-'a']++;
                target[t.charAt(i)-'a']++;
            }
            for(int i = 0; i < target.length; i++){
                System.out.println(target[i]);
                System.out.println(source[i]);
            }
            int result =0;
            for(int i = 0; i < target.length; i++){

                if(target[i] > source[i]) result = result+ Math.abs(target[i]-source[i]);

            }
return result;
        }
    }
}
