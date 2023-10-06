package simple;

public class ReformatTheString {

    public static void main(String[] args)
    {
        ReformatTheString.Solution solution = new ReformatTheString.Solution();
        System.out.println(solution.reformat("covid2019"));

    }

    static class Solution {
        public String reformat(String s) {
            StringBuilder alpha = new StringBuilder();
            StringBuilder digit = new StringBuilder();
            StringBuilder result = new StringBuilder();

            for (char ch :s.toCharArray()) {
                if (ch >= 'a' && ch <= 'z') {
                    alpha.append(ch);
                } else {
                    digit.append(ch);
                }
            }
            System.out.println(alpha.toString());
            System.out.println(digit.toString());

            if ( Math.abs(alpha.length() - digit.length() ) > 1) return "";
            int i = 0, j = 0;
            if(alpha.length() > digit.length()) result.append(alpha.charAt(i++));

            while (result.length() < s.length()){
                result.append(digit.charAt(j++));
                if(result.length() >= s.length()) break;
                result.append(alpha.charAt(i++));


            }
        return result.toString();
        }
    }
}



