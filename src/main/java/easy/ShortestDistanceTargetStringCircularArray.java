package easy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShortestDistanceTargetStringCircularArray {

    public static void main(String[] args) throws IOException {

        // String[] strAr1=new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"};
       //  List<Integer> = ShortestDistanceTargetStringCircularArray.closetTarget("eetcodes");
        //  System.out.println(result);
    }

    public static int closetTarget(String[] words, String target, int startIndex) {
       int res = Integer.MAX_VALUE;
        for(int i=0;i<words.length;i++){
            if(words[i].equals(target)){
                res=Math.min(res,Math.abs(startIndex-i));
                res=Math.min(res, Math.abs(words.length-startIndex+i));
                res=Math.min(res, Math.abs(words.length+startIndex-i));
            }
        }
        res = res==Integer.MAX_VALUE?-1:res;
        return res;


    }
}
