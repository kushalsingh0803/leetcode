package simple;

public class ExcelSheetColumnNumber {

    public int solve(String columnTitle) {
        ExcelSheetColumnNumber.Solution solution = new ExcelSheetColumnNumber.Solution();
        return solution.titleToNumber(columnTitle);
    }


    class Solution {
        public int titleToNumber(String columnTitle) {
        int columnNumber = 0;

        for (int i =0;i< columnTitle.length();i++){

            columnNumber *=26;
            columnNumber += columnTitle.charAt(i) - '@';
        }

        return  columnNumber;
        }
    }
}
