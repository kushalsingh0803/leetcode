package simple;

public class StrongPasswordCheckerII {


    public boolean solve(String password) {
        StrongPasswordCheckerII.Solution solution = new StrongPasswordCheckerII.Solution();
        return solution.strongPasswordCheckerII(password);
    }


    class Solution {
        public boolean strongPasswordCheckerII(String password) {

            if ( password.length() < 8) return false;

            boolean upperChar = false;
            boolean lowerChar = false;
            boolean numChar = false;
            boolean specialChar = false;
            String specialCharList = "!@#$%^&*()-+";
            char previousChar ='.';
            for (int i = 0; i <password.length();i++){

                char c = password.charAt(i);
                if (c == previousChar) return  false;
                else previousChar =c;
                if ( c >= 'a' && c <= 'z') lowerChar = true;
                if ( c >= 'A' && c <= 'Z') upperChar = true;
                if ( c >= '0' && c <= '9') numChar = true;
                if ( specialCharList.indexOf(c) != -1) specialChar = true;
            }




                return (upperChar && lowerChar && numChar && specialChar);

        }
    }
}
