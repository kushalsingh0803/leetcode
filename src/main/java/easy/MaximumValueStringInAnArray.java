package easy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class MaximumValueStringInAnArray {


    public static void main(String[] args) throws IOException {

         String[] testCaseInputs=new String[] {"1","01","001","0001"};
        int result = MaximumValueStringInAnArray.maximumValue(testCaseInputs);
        System.out.println(result);
    }

    public static int maximumValue(String[] strs) {
        int res = 0;
        boolean alphaFound = false;
        for(String str :strs){
            alphaFound = false;
            for(char c:str.toCharArray()) {
                if (c >= 'a' && c <= 'z') alphaFound = true;
            }
            res = alphaFound?Math.max(res,str.length()):Math.max(res,Integer.parseInt(str));

        }
        return res;

    }
}
