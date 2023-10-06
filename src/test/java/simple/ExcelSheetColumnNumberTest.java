package simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ExcelSheetColumnNumberTest {


    static List<Integer> testCasesOutput = Arrays.asList(
            1, 28,701,887,56768,107,104
    );
    static List<String> testCaseInputs = Arrays.asList(
            "A","AB","ZY","AHC","CEYJ","DC","CZ"
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            ExcelSheetColumnNumber solution = new ExcelSheetColumnNumber();
            //  Assert.assertEquals(String.format("test case %d failed", i),(String) testCasesOutput.get(i),  solution.solve(testCaseInputs.get(i)));
            System.out.println(solution.solve(testCaseInputs.get(i)));
        }
    }
}