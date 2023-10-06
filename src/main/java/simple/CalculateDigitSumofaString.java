package simple;

public class CalculateDigitSumofaString {


    class Solution {
        public String digitSum(String s, int k) {

            while(s.length() > k) {

                StringBuilder consecutiveNumber = new StringBuilder();

                for(int i=0; i<s.length(); i=i+k){
                    int sum = 0;
                    for(int j=i; j<s.length() && j<i+k ; j++)
                        sum += Character.getNumericValue(s.charAt(j));
                    consecutiveNumber.append(sum);
                }



                s = consecutiveNumber.toString();
            }
            return s;

        }


    }
}
