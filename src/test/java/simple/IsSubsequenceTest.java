package simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class IsSubsequenceTest {

    static List<String[]> testCaseInputs = Arrays.asList(
            new String[] {"abc", "ahbgdc"},
            new String[] {"axc", "ahbgdc"},
           new String[] {"axc", "ahbxgdc"},
           new String[] {"paper", "tiipahjpder"},
            new String[] {"ACAB", "XCXY"}
    );

    static List<Boolean> testCasesOutput = Arrays.asList(
            true, false, false,true,true
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            IsSubsequence solution = new IsSubsequence();
            //   Assert.assertEquals(String.format("test case %d failed", i), testCasesOutput.get(i),  solution.solve(testCaseInputs.get(i)[0],testCaseInputs.get(i)[1]));
            System.out.println(solution.solve(testCaseInputs.get(i)[0],testCaseInputs.get(i)[1]));
        }
    }
}