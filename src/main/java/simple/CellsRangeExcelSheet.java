package simple;

import java.util.ArrayList;
import java.util.List;

public class CellsRangeExcelSheet {

    class Solution {
        public List<String> cellsInRange(String s) {
            List<String> result = new ArrayList<>();
            for (char r = s.charAt(0); r <= s.charAt(3); r++) {
                for (char n = s.charAt(1); n <= s.charAt(4); n++) {
                    String str = "" + r;
                    str = str + n;
                    result.add(str);
                }


            }
            return result;
        }
    }
}