package simple;

public class PerformingOperations {


    public int solve(String[] operations) {
        PerformingOperations.Solution solution = new PerformingOperations.Solution();
        return solution.finalValueAfterOperations(operations);
    }

    class Solution {
        public int finalValueAfterOperations(String[] operations) {

            int sum =0;

            for (String s : operations){
                sum += ((s.contains("+")) ? 1 :-1);

            }
            return sum;
        }
    }
}
