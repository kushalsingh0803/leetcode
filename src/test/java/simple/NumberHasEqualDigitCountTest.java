package simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NumberHasEqualDigitCountTest {


    static List<String> testCaseInputs = Arrays.asList(
            new String ("1210"),
            new String ("030"),
            new String ("0112")

    );

    static List<Boolean> testCasesOutput = Arrays.asList(
            true, false, true
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            NumberHasEqualDigitCount solution = new NumberHasEqualDigitCount();
            //Assert.assertEquals(String.format("test case %d failed", i),(Boolean) testCasesOutput.get(i), solution.solve(testCaseInputs.get(i)));
            System.out.println(solution.solve(testCaseInputs.get(i)));
        }
    }
}