package simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DetermineStringHalvesAreAlikeTest {

    static List<String> testCaseInputs = Arrays.asList(
            new String ("book"),
            new String ("textbook"),
            new String ("teatbook")

    );

    static List<Boolean> testCasesOutput = Arrays.asList(
            true, false, true
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            DetermineStringHalvesAreAlike solution = new DetermineStringHalvesAreAlike();
            //Assert.assertEquals(String.format("test case %d failed", i),(Boolean) testCasesOutput.get(i), solution.solve(testCaseInputs.get(i)));
            System.out.println(solution.solve(testCaseInputs.get(i)));
        }
    }
}