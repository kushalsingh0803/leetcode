package simple;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class IsomorphicStringsTest {

    static List<String[]> testCaseInputs = Arrays.asList(
            new String[] {"egg", "add"},
            new String[] {"foo", "bar"},
            new String[] {"carr", "rate"},
            new String[] {"paper", "title"},
            new String[] {"ACAB", "XCXY"}
    );

    static List<Boolean> testCasesOutput = Arrays.asList(
            true, false, false,true,true
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            IsomorphicStrings solution = new IsomorphicStrings();
         //   Assert.assertEquals(String.format("test case %d failed", i), testCasesOutput.get(i),  solution.solve(testCaseInputs.get(i)[0],testCaseInputs.get(i)[1]));
            System.out.println(solution.solve(testCaseInputs.get(i)[0],testCaseInputs.get(i)[1]));
        }
    }

}