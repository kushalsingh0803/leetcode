package simple;

public class GoalParserInterpretation {


    public String solve(String command) {
        GoalParserInterpretation.Solution solution = new GoalParserInterpretation.Solution();
        return solution.interpret(command);
    }

    class Solution {
        public String interpret(String command) {


            command = command.replace("()","o");

            command = command.replace("(al)","al");


            return command;
        }
    }
}
