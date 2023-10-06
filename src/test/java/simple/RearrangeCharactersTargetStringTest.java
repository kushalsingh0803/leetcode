package simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RearrangeCharactersTargetStringTest {

    static List<String[]> testCaseInputs = Arrays.asList(
            new String[] {"ilovecodingonleetcode", "code"},
            new String[] {"abcba", "abc"},
            new String[] {"abbaccaddaeea", "aaaaa"}


    );

    static List<Boolean> testCasesOutput = Arrays.asList(
            true, false, false,true,true
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            RearrangeCharactersTargetString solution = new RearrangeCharactersTargetString();
            //   Assert.assertEquals(String.format("test case %d failed", i), testCasesOutput.get(i),  solution.solve(testCaseInputs.get(i)[0],testCaseInputs.get(i)[1]));
            System.out.println(solution.solve(testCaseInputs.get(i)[0],testCaseInputs.get(i)[1]));
        }
    }
}