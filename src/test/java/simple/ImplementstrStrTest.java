package simple;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ImplementstrStrTest {

   /* static List<String,String> testCaseInputs = (List<String, String>) Arrays.asList(
            new String[] {"flower", "flow", "flight"},
            new String[] {"flower", "flo", "flight"},
            new String[] {"flower", "flower", "flower"},
            new String[] {"flower", "aflower", "flower"}
    );*/

    static List<String> testCasesOutput = Arrays.asList(
            "5", "-1", "0"
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
       // for (int i=0;i<testCasesOutput.size();i++){
            ImplementstrStr solution = new ImplementstrStr();
            Assert.assertEquals(("test case %d failed 1"),2, solution.solve("hello","ll"));
        Assert.assertEquals(("test case %d failed 2"),5, solution.solve("GeeksForGeeks","For"));

       Assert.assertEquals(("test case %d failed 3"),-1, solution.solve("aaaaa","bba"));
                            Assert.assertEquals(("test case %d failed 4"),0, solution.solve("hello",""));
        Assert.assertEquals(("test case %d failed 5"),-1, solution.solve("cbcak","akr"));



        }
    }

