package simple;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ExcelSheetColumnTitleTest {



    static List<Integer> testCaseInputs = Arrays.asList(
            1, 28,701,887,56768,107,104
    );
    static List<String> testCasesOutput = Arrays.asList(
            "A","DDF","ZYE","FGG"
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            ExcelSheetColumnTitle solution = new ExcelSheetColumnTitle();
          //  Assert.assertEquals(String.format("test case %d failed", i),(String) testCasesOutput.get(i),  solution.solve(testCaseInputs.get(i)));
            System.out.println(solution.solve(testCaseInputs.get(i)));
        }
    }
}