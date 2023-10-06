package simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class KeyboardRowTest {

    static List<String[]> testCaseInputs = Arrays.asList(
            new String[] {"adsdf","sfd"},
            new String[] {"Hello","Alaska","Dad","Peace"},
            new String[] {"omk"},
            new String[] {"robed", "bored","bbnnhh", "xccvbnn"},
           new String[] {"elbow", "befghhglow", "htrgvg", "xcvbnb", "erty", "fvghjkjy","sdfghjh", "erty"}
    );

    static List<Boolean> testCasesOutput = Arrays.asList(
            true, false, false,true,true
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            KeyboardRow solution = new KeyboardRow();
            //  Assert.assertEquals(String.format("test case %d failed", i), testCasesOutput.get(i),  solution.solve(testCaseInputs.get(i)[0],testCaseInputs.get(i)[1]));
           // System.out.println(solution.solve(testCaseInputs.get(i)));

                System.out.println(Arrays.toString(solution.solve(testCaseInputs.get(i))));


        }
    }
}