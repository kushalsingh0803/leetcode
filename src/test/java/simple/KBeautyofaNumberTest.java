package simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class KBeautyofaNumberTest {


    static List<Integer> testCaseInputs = Arrays.asList(
            240,430043
    );
    static List<Integer> testCaseInputs2 = Arrays.asList(
            2,2
    );
    static List<String> testCasesOutput = Arrays.asList(
            "A","DDF","ZYE","FGG"
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            KBeautyofaNumber solution = new KBeautyofaNumber();
            //  Assert.assertEquals(String.format("test case %d failed", i),(String) testCasesOutput.get(i),  solution.solve(testCaseInputs.get(i)));
            System.out.println(solution.solve(testCaseInputs.get(i), testCaseInputs2.get(i)));
        }
    }
}