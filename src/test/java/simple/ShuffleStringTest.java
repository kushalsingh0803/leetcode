package simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ShuffleStringTest {

    static List<String> testCaseInputs = Arrays.asList(
            "codeleet", "abc"
    );
    static List<int[]> testCaseInputs2 = Arrays.asList(
            new int[] {4,5,6,7,0,2,1,3},
            new int[] {0,1,2}
    );

    static List<Boolean> testCasesOutput = Arrays.asList(
            false, false, false,true,true
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            ShuffleString solution = new ShuffleString();
            //  Assert.assertEquals(String.format("test case %d failed", i), testCasesOutput.get(i),  solution.solve(testCaseInputs.get(i)[0],testCaseInputs.get(i)[1]));
            System.out.println(solution.solve(testCaseInputs.get(i),testCaseInputs2.get(i) ));
        }
    }
}