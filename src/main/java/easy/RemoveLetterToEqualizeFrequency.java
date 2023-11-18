package easy;

import java.io.IOException;
import java.util.Arrays;

public class RemoveLetterToEqualizeFrequency {
    public static void main(String[] args) throws IOException {

       // String[] strAr1=new String[] {"hello","leetcode"};
        boolean result = RemoveLetterToEqualizeFrequency.equalFrequency("aabb");
        System.out.println(result);
    }

    public static  boolean equalFrequency(String word) {

        int[] charCounts = new int[26];
        int distinctCharCount =0;
        for (char ch : word.toCharArray()) {
            charCounts[ch - 'a']++;
            if (charCounts[ch - 'a'] == 1) distinctCharCount++;
        }
        Arrays.sort(charCounts);
        if(distinctCharCount ==1 ||charCounts[25] ==1|| charCounts[25] - charCounts[24] == 1 && charCounts[26 - distinctCharCount] == charCounts[24] || charCounts[26 - distinctCharCount] == 1 && charCounts[25] == charCounts[26 - distinctCharCount+1])

        return true;
        else return false;
    }
}
