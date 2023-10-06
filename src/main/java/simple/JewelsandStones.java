package simple;

public class JewelsandStones {

    public int solve(String jewels, String stones) {
        JewelsandStones.Solution solution = new JewelsandStones.Solution();
        return solution.numJewelsInStones(jewels,stones);
    }

    class Solution {
        public int numJewelsInStones(String jewels, String stones) {

            int count=0;
            for(int i=0;i<stones.length();i++)
            {
                for(int k=0;k<jewels.length();k++)
                {
                    if(stones.charAt(i)==jewels.charAt(k))
                        count++;
                }
            }
            return count;


        }
    }
}
