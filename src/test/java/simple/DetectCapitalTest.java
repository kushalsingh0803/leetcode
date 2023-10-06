package simple;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DetectCapitalTest {
    static List<String> testCaseInputs = Arrays.asList(
            new String ("ABCFH"),
            new String ("leeetcode"),
            new String ("FlaG"),
            new String ("LeeeTcode"),
            new String ("Google")

    );

    static List<Boolean> testCasesOutput = Arrays.asList(
            true, true, false, true, true
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            DetectCapital solution = new DetectCapital();
          //  Assert.assertEquals(String.format("test case %d failed", i),(Boolean) testCasesOutput.get(i), solution.solve(testCaseInputs.get(i)));
            System.out.println(solution.solve(testCaseInputs.get(i)));
        }
    }
}