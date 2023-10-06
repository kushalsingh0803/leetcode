package simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DIStringMatchTest {

    static List<String> testCaseInputs = Arrays.asList(
            new String ("IDID"),
            new String ("III"),
            new String ("DDI")

    );

    static List<Boolean> testCasesOutput = Arrays.asList(
            true, false, true
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            DIStringMatch solution = new DIStringMatch();
            //Assert.assertEquals(String.format("test case %d failed", i),(Boolean) testCasesOutput.get(i), solution.solve(testCaseInputs.get(i)));
            System.out.println(Arrays.toString(solution.solve(testCaseInputs.get(i))));
        }
    }
}