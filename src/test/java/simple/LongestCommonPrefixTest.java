package simple;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


class LongestCommonPrefixTest {

    static List<String[]> testCaseInputs = Arrays.asList(
            new String[] {"flower", "flow", "flight"},
            new String[] {"flower", "flo", "flight"},
            new String[] {"flower", "flower", "flower"},
            new String[] {"flower", "aflower", "flower"}
    );

    static List<String> testCasesOutput = Arrays.asList(
            "fl", "fl", "flower",""
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            LongestCommonPrefix solution = new LongestCommonPrefix();
            Assert.assertEquals(String.format("test case %d failed", i),testCasesOutput.get(i), solution.solve(testCaseInputs.get(i))


            );
        }
    }


}