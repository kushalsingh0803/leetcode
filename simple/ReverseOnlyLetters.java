package simple;

public class ReverseOnlyLetters {



    public static void main(String[] args)
    {
        ReverseOnlyLetters.Solution solution = new ReverseOnlyLetters.Solution();
        System.out.println(solution.reverseOnlyLetters("a-bC-dEf-ghIj"));

    }


    static class Solution {
        public String reverseOnlyLetters(String s) {
            char[] chars = s.toCharArray();
            int i =0;
            int j = s.length()-1;
            while (i<j){

                while(i < j && (chars[i] < 65 || chars[i] > 122  || (chars[i] > 90 && chars[i] < 97 ) )) i++;

                while(j > i && (chars[j] < 65 || chars[j] > 122  || (chars[j] > 90 && chars[j] < 97 ) )) j--;
                System.out.println(i);
                System.out.println(j);
                char tmp = chars[i];
                chars[i] = chars[j];
                chars[j] = tmp;
                i++; j--;
            }

            return new String(chars);
        }
    }
}
