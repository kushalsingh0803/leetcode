package simple;

public class ExcelSheetColumnTitle {

    public String solve(int columnNumber) {
        ExcelSheetColumnTitle.Solution solution = new ExcelSheetColumnTitle.Solution();
        return solution.convertToTitle(columnNumber);
    }


    class Solution {
        public String convertToTitle(int columnNumber) {
            StringBuilder columnName = new StringBuilder();

            while (columnNumber > 0){
                int rem = columnNumber%26;
                if (rem == 0){

                    columnName= columnName.append('Z');
                    columnNumber = columnNumber/26 -1;

                }
                else {

                    columnName= columnName.append((char)((rem-1) +'A'));
                    columnNumber = columnNumber/26;
                }



            }


            return columnName.reverse().toString();
        }
    }
}
