package simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ReplaceAllDigitswithCharactersTest {

    static List<String> testCaseInputs = Arrays.asList(
            new String ("a1c1e1"),
            new String ("a1b2c3d4e"),
            new String ("a1b2c3d4ea1b2c3d4e")

    );

    static List<Boolean> testCasesOutput = Arrays.asList(
            true, true, false, true, true
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            ReplaceAllDigitswithCharacters solution = new ReplaceAllDigitswithCharacters();
            //  Assert.assertEquals(String.format("test case %d failed", i),(Boolean) testCasesOutput.get(i), solution.solve(testCaseInputs.get(i)));
            System.out.println(solution.solve(testCaseInputs.get(i)));
        }
    }
}