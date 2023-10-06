package simple;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


public class LengthOfLastWordTest {

    static List<String> testCaseInputs = Arrays.asList(
            new String ("Geeks For Geeks  "),
            new String ("Hello World"),
            new String ("   fly me   to   the moon  "),
            new String ("luffy is still joyboy")
    );

    static List<Integer> testCasesOutput = Arrays.asList(
            5, 5, 4,6
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            LengthOfLastWord solution = new LengthOfLastWord();
            Assert.assertEquals(String.format("test case %d failed", i),(Integer) testCasesOutput.get(i), (Integer) solution.solve(testCaseInputs.get(i)));
        }
    }

}