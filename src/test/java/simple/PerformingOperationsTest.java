package simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PerformingOperationsTest {


    static List<String[]> testCaseInputs = Arrays.asList(
            new String[] {"--X","X++","X++"},
            new String[] {"++X","++X","X++"},
            new String[] {"++X","++X","X++","++X","++X","X++"},
            new String[] {"X++","++X","--X","X--"},
            new String[] {"X++","++X","--X","X--","X++","++X","--X"}
    );

    static List<Boolean> testCasesOutput = Arrays.asList(
            false, false, false,true,true
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            PerformingOperations solution = new PerformingOperations();
            //  Assert.assertEquals(String.format("test case %d failed", i), testCasesOutput.get(i),  solution.solve(testCaseInputs.get(i)[0],testCaseInputs.get(i)[1]));
            System.out.println(solution.solve(testCaseInputs.get(i)));
        }
    }
}