package simple;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class GoalParserInterpretationTest {

    static List<String> testCaseInputs = Arrays.asList(
            new String ("G()(al)"),
          new String ("G()()()()(al)"),
            new String ("(al)G(al)()()GG()()()()(al)")

    );

    static List<String> testCasesOutput = Arrays.asList(
            "1[.]1[.]1[.]1","255[.]100[.]50[.]0", "255[.]100[.]50[.]0[.]567[.]455"
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            GoalParserInterpretation solution = new GoalParserInterpretation();
            //Assert.assertEquals(String.format("test case %d failed", i), testCasesOutput.get(i),  solution.solve(testCaseInputs.get(i)));
            System.out.println((solution.solve(testCaseInputs.get(i))));

        }
    }
}