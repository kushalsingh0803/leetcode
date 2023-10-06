package simple;

public class DefangingIPAddress {


    public String solve(String address) {
        DefangingIPAddress.Solution solution = new DefangingIPAddress.Solution();
        return solution.defangIPaddr(address);
    }

    class Solution {
        public String defangIPaddr(String address) {

           return  address.replaceAll("\\.","[.]");
        }
    }
}
