package medium;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class PartitionLabels {

    public static void main(String[] args) throws IOException {

        // String[] strAr1=new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"};
        List<Integer> result = PartitionLabels.partitionLabels("ababcbacadefegdehijhklij");
        System.out.println(result);
    }

    public static  List<Integer> partitionLabels(String s) {

        List<Integer> res = new ArrayList<>();
        int counter =0;
        for(int i = 0; i < s.length(); i+=counter) {
            counter = s.lastIndexOf(s.charAt(i));
            for (int j = i; j < counter; j++){
                int lastIndexOf = s.lastIndexOf(s.charAt(j));
                if (lastIndexOf > counter){
                    counter = lastIndexOf;
                }
            }
             counter+=1-i;
            res.add(counter);
        }
        return res;
    }
}
