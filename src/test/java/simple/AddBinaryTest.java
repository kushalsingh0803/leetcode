package simple;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AddBinaryTest {


    static List<String[]> testCaseInputs = Arrays.asList(
            new String[] {"11", "1"},
            new String[] {"1010", "1011"},
            new String[] {"1010", "11"},
            new String[] {"11100", "10101"}
    );

    static List<String> testCasesOutput = Arrays.asList(
            "100", "10101", "1101","110001"
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            AddBinary solution = new AddBinary();
            Assert.assertEquals(String.format("test case %d failed", i), testCasesOutput.get(i),  solution.solve(testCaseInputs.get(i)[0],testCaseInputs.get(i)[1]));
            //System.out.println(solution.solve(testCaseInputs.get(2)[0],testCaseInputs.get(2)[1]));
        }
    }

}