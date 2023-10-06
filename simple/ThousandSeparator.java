package simple;

public class ThousandSeparator {

    public static void main(String[] args)
    {
        ThousandSeparator.Solution solution = new ThousandSeparator.Solution();
        System.out.println(solution.thousandSeparator(15040));

    }

    static class Solution {
        public String thousandSeparator(int n) {

            if(n < 1000){
                return String.valueOf(n);
            }

            String result = "";

            while (n>0) {


                   if (String.valueOf(n % 1000).length() == 2 && n>1000)
                        result = "0" + String.valueOf(n % 1000) + result;
                    else if (String.valueOf(n % 1000).length() == 1 && n>1000) result = "00" + String.valueOf(n % 1000) + result;
                    else result = String.valueOf(n % 1000) + result;
                    if (n > 1000) result = "." + result;
                    n = n / 1000;


            }
            return result;
        }
    }
}
