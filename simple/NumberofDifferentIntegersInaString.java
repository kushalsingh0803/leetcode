package simple;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;
public class NumberofDifferentIntegersInaString {

    public static void main(String[] args)
    {
        NumberofDifferentIntegersInaString.Solution solution = new NumberofDifferentIntegersInaString.Solution();
        System.out.println(solution.numDifferentIntegers("23937068802361104070596246969678287627526519827301152216904378215082294194107715415323940" +
                "065974637155137417258524325590572244788151165573802603904322112275796635710468458422817042817495711100769742649719898936071371404562543" +
                "46955633455446057823738757323149856858154529105301197388177242583658641529908583934918768953462557716z" +
                "9743802042995294464628808417333470" +
                "10475741889362013248451491101767161302670416744382376080387344315194398281913442386095675303991893168463597662565073712405306206971028642" +
                "387923502899784505091626970689486047226467391745905303365104750615210945038505984535367069826952124939029682517028532039296169302912570621" +
                "73c" +
                "79487281900662343830648295410"));

    }
    static class Solution {
        public int numDifferentIntegers(String word) {
            Set<BigInteger> numberList = new HashSet<>();

            String number = "";
            boolean numberFound = false;
            for(int i =0; i < word.length();i++){
                char ch = word.charAt(i);
                if ( ch > 47 && ch < 58){
                    number= number+ch;
                    numberFound = true;
                }
                else if ( numberFound ){

                    numberFound = false;
                    numberList.add( new BigInteger (number));
                    number ="";

                }

                if ( numberFound && i == word.length()-1){

                    numberFound = false;
                    numberList.add( new BigInteger (number));
                    number ="";

                }


            }

            return numberList.size();
        }
    }
}
