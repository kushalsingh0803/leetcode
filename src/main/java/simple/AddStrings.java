package simple;
import java.math.BigInteger;
public class AddStrings {

    public String solve(String s, String t) {
        AddStrings.Solution solution = new AddStrings.Solution();
        return solution.addStrings(s,t);
    }

    class Solution {
        public String addStrings(String num1, String num2) {
            BigInteger i= new BigInteger(num1);
            BigInteger j=new BigInteger(num2);

            return String.valueOf(i.add(j));
        }
    }
}
