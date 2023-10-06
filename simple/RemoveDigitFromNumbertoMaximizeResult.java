package simple;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveDigitFromNumbertoMaximizeResult {

    class Solution {
        public String removeDigit(String number, char digit) {
            ArrayList<String> numberList = new ArrayList<String>();

            for ( int i =0;i<number.length();i++){
                char ch = number.charAt(i);
                if(ch == digit){
                    String digitNumber = i==0 ? number.substring(1) : number.substring(0,i)+number.substring(i+1);
                    numberList.add(digitNumber);
                }



            }
            Collections.sort(numberList);
            return numberList.get(numberList.size()-1);
        }
    }
}
