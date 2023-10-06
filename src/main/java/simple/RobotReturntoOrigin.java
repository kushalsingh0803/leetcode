package simple;

public class RobotReturntoOrigin {

    public boolean solve(String moves) {
        RobotReturntoOrigin.Solution solution = new RobotReturntoOrigin.Solution();
        return solution.judgeCircle(moves);
    }

    class Solution {
        public boolean judgeCircle(String moves) {
         int x = 0; int y =0;

            for ( char c:moves.toCharArray()){
                 if ( c=='U') y++;
                if ( c=='D') y--;
                if ( c=='L') x--;
                if ( c=='R') x++;
            }

            if (x ==0 && y == 0) return true;
            return  false;
        }
    }

}
