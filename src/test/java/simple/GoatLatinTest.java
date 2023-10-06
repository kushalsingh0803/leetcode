package simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class GoatLatinTest {

    static List<String> testCaseInputs = Arrays.asList(
            new String ("I speak Goat Latin"),
            new String ("The quick brown fox jumped over the lazy dog"),
            new String ("The quick brown fox jumped over the lazy dog I speak Goat Latin")


    );

    static List<Boolean> testCasesOutput = Arrays.asList(
            true, true, false, true, true
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            GoatLatin solution = new GoatLatin();
            //  Assert.assertEquals(String.format("test case %d failed", i),(Boolean) testCasesOutput.get(i), solution.solve(testCaseInputs.get(i)));
            System.out.println(solution.solve(testCaseInputs.get(i)));
        }
    }
}