package simple;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ReverseStringTest {

    static List<char[]> testCaseInputs = Arrays.asList(
            new char[] {'H','a','n','n','a','h'},
            new char[] {'h','e','l','l','o'}
    );

    static List<String> testCasesOutput = Arrays.asList(
            "100", "10101"
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            ReverseString solution = new ReverseString();
            //Assert.assertEquals(String.format("test case %d failed", i), "test",  solution.solve(testCaseInputs.get(i)));
            solution.solve(testCaseInputs.get(i));
        }
    }

}