package simple;

public class CheckifOneStringSwapCanMakeStringsEqual {

    public static void main(String[] args)
    {
        CheckifOneStringSwapCanMakeStringsEqual.Solution solution = new CheckifOneStringSwapCanMakeStringsEqual.Solution();
        System.out.println(solution.areAlmostEqual("bank", "kanb"));

    }

    static class Solution {
        public boolean areAlmostEqual(String s1, String s2) {
            if(s1.equals(s2)) return true;
            int count=0;
            String first ="";
            String second ="";
            for(int i=0;i<s1.length();i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    count++;
                    if (count > 2) {
                        return false;
                    }
                    first = first + String.valueOf(s1.charAt(i));
                    first = first +"-";
                    second = second+ String.valueOf(s2.charAt(i));
                    second = second +"-";
                }
            }
            System.out.println(first);
            System.out.println(second);
            if ( count ==1) return false;
            if(first.charAt(0)==second.charAt(2) && first.charAt(2)==second.charAt(0)){
                return true;
            }
            return false;
        }
    }
}
