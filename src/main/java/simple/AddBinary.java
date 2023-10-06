package simple;

public class AddBinary {


    public String solve(String a, String b) {
        AddBinary.Solution solution = new AddBinary.Solution();
        return solution.AddBinary(a,b);
    }

    class Solution {
        public String AddBinary(String a, String b) {
            int len1 = a.length();
            int len2 = b.length();
            int carry = 0;
            String result = "";
            int maxLenght = Math.max(len1, len2);

            for (int i = 0; i < maxLenght; i++) {

                int p = i < len1 ?  a.charAt(len1 - 1 - i) -'0' : 0;
                int s = i < len2 ?  b.charAt(len2 - 1 - i) -'0' : 0;

                int tmp = p + s + carry;

                carry = tmp / 2;

                result = tmp % 2 + result;

            }


            return (carry == 0) ? result : "1" + result;


        }
    }
}
