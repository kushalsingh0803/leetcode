package medium;

import java.io.IOException;

public class MinimumSuffixFlips {

    public static void main(String[] args) throws IOException {

        // String[] strAr1=new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"};
        int result = MinimumSuffixFlips.minFlips("10111");
        System.out.println(result);
    }

    public static  int minFlips(String target) {

        int res = 0;

      char lastflipChar = '0';

      for(char c: target.toCharArray()){

          if ( lastflipChar != c){

              res++;
              lastflipChar =c;
          }
      }

        return res;
    }
}
