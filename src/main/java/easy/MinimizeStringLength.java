package easy;

import medium.SortVowelsInString;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class MinimizeStringLength {

    public static void main(String[] args) throws IOException {

        // String[] strAr1=new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"};
        int result = MinimizeStringLength.minimizedStringLength("lEetcOde");
        System.out.println(result);
    }

    public static int minimizedStringLength(String s) {
        HashSet<Character> uniqueChar = new HashSet<>();
        for (char c : s.toCharArray()) {
            uniqueChar.add(c);
        }
        return uniqueChar.size();
    }
}
