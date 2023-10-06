package simple;

public class LargestOddNumberinString {

    public static void main(String[] args)
    {
        LargestOddNumberinString.Solution solution = new LargestOddNumberinString.Solution();
        System.out.println(solution.largestOddNumber("52"));

    }

    static class Solution {
        public String largestOddNumber(String num) {



            for ( int i = num.length()-1;i>=0;i--){

                if (Integer.parseInt(num.charAt(i)+"") %2 != 0){

                    return num.substring(0,i+1);
                }

            }
       return "";

        }
    }
}
