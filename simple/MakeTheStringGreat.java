package simple;

public class MakeTheStringGreat {


    class Solution {
        public String makeGood(String s) {
            StringBuilder sb = new StringBuilder(s);


            for (int i = 0; i < sb.length(); i++) {

                if (Math.abs((int) sb.charAt(i) - (int) sb.charAt(i + 1)) == 32) {
                    sb.deleteCharAt(i);
                    sb.deleteCharAt(i);
                    if(i == 0)
                        --i;
                    else
                        i = i-2;
                }
                if (sb.length() == 0)
                    return "";
            }


            return sb.toString();
        }
    }
}
