package simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TruncateSentenceTest {


    static List<String> testCaseInputs = Arrays.asList(
            "Hello how are you Contestant", "What is the solution to this problem", "chopper is not a tanuki"
    );

    static List<Integer> testCaseInputs2 = Arrays.asList(
            4,4,5
    );

    static List<String> testCasesOutput = Arrays.asList(
            "fl", "fl", "flower",""
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            TruncateSentence solution = new TruncateSentence();
            // Assert.assertEquals(String.format("test case %d failed", i),testCasesOutput.get(i), solution.solve(testCaseInputs.get(i))
            System.out.println(solution.solve(testCaseInputs.get(i), testCaseInputs2.get(i)));


        }
    }
}