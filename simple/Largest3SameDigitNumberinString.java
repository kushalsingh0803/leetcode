package simple;

public class Largest3SameDigitNumberinString {


    class Solution {
        public String largestGoodInteger(String num) {

            int k =0;
            String result = "";
            int j =0;
            boolean found = false;
            for( int i =2; i<num.length();i++){
                 if((num.charAt(i-2) == num.charAt(i-1))  && (num.charAt(i-1) == num.charAt(i)) ){
                     result = num.substring(i-2,i+1);
                     j = Integer.parseInt(result);
                     found = true;
                     if (j>k) k =j;
                 }
            }


            if( k == 0 & !found)  return  "";

            else if ( k==0) return "000";
            else return String.valueOf(k);

        }
    }
}
