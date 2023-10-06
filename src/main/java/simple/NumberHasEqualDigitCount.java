package simple;

public class NumberHasEqualDigitCount {

    public boolean solve(String num) {
        NumberHasEqualDigitCount.Solution solution = new NumberHasEqualDigitCount.Solution();
        return solution.digitCount(num);
    }

    class Solution {
        public boolean digitCount(String num) {


            for (int i=0;i < num.length();i++){
                int count = 0;
                for (int j = 0; j < num.length(); j++) {

                    if (Integer.parseInt(String.valueOf(num.charAt(j))) == i) {

                        count++;
                    }
                }

               if (count != Integer.parseInt(String.valueOf(num.charAt(i)))) return false;
            }
            return true;

        }
    }
}
