package medium;

import java.util.Arrays;

public class CheckIfStringCanBreakAnotherString {

    public boolean checkIfCanBreak(String s1, String s2) {


        char[] s1CharList = s1.toCharArray();
        char[] s2CharList = s2.toCharArray();
        Arrays.sort(s1CharList);
        Arrays.sort(s2CharList);
        boolean s1vsS2 = true;
        boolean s2vsS1 = true;
        for(int i=0;i<s1.length();i++){
            if(s1CharList[i]<s2CharList[i])
                s2vsS1=false;
            if(s1CharList[i]>s2CharList[i])
                s1vsS2 =false;
        }
        return s1vsS2||s2vsS1;
    }

}
