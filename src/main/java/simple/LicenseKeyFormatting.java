package simple;

public class LicenseKeyFormatting {



    public String solve(String s, int k) {
        LicenseKeyFormatting.Solution solution = new LicenseKeyFormatting.Solution();
        return solution.licenseKeyFormatting(s,k);
    }


    class Solution {
        public String licenseKeyFormatting(String s, int k) {
            s = s.replaceAll("[^a-zA-Z0-9]", "");

            s= s.toUpperCase();

            int remainChar = s.length()%k;
            int i =0;
            StringBuilder result = new StringBuilder();
            if ( remainChar != 0) {

                result.append(s, 0, remainChar);
                if (remainChar < s.length()) {
                    result.append("-");
                }
                i=remainChar;
            }
            int j =0;
            while( i<s.length()) {

                result.append(s.charAt(i));
                j++;
                i++;
                if ( j == k && i !=s.length()) {
                    result.append("-");
                    j=0;
                }
            }
            return result.toString();
        }
    }
}
