package simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SortingtheSentenceTest {


    static List<String> testCaseInputs = Arrays.asList(
            new String ("is2 sentence4 This1 a3"),
            new String ("Myself2 Me1 I4 and3"),
            new String ("Myself2 Me1 I4 and3 is7 sentence6 This8 a5")


    );

    static List<Boolean> testCasesOutput = Arrays.asList(
            true, true, false, true, true
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            SortingtheSentence solution = new SortingtheSentence();
            //  Assert.assertEquals(String.format("test case %d failed", i),(Boolean) testCasesOutput.get(i), solution.solve(testCaseInputs.get(i)));
            System.out.println(solution.solve(testCaseInputs.get(i)));
        }
    }
}