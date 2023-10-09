package easy;

import java.io.IOException;
import java.util.HashSet;

public class CountNumberofVowelStringRange {

    public static void main(String[] args) throws IOException {

        String[] strAr1=new String[] {"are","amy","u"};
        int result = CountNumberofVowelStringRange.vowelStrings(strAr1, 0,2);
        System.out.println(result);
    }

    public static int vowelStrings(String[] words, int left, int right) {

        int res = 0;
        for (; left <= right; left++){
  char firstLetter = words[left].charAt(0);
        char lastLetter = words[left].charAt(words[left].length()-1);
            if ((firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o' || firstLetter == 'u') && (lastLetter == 'a' || lastLetter == 'e' || lastLetter == 'i' || lastLetter == 'o' || lastLetter == 'u')) res++;

    }
        return res;
    }
}
