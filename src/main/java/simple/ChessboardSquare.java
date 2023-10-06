package simple;

public class ChessboardSquare {

    public boolean solve(String coordinates) {
        ChessboardSquare.Solution solution = new ChessboardSquare.Solution();
        return solution.squareIsWhite(coordinates);
    }

    class Solution {
        public boolean squareIsWhite(String coordinates) {
     int i = coordinates.charAt(0)-96 + coordinates.charAt(1)-48;
     if (i%2 == 0){
         return false;
     }
     else return true;
        }
    }
}
