package simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MaxNumofWordsFoundinSentencesTest {

    static List<String[]> testCaseInputs = Arrays.asList(
            new String[] {"alice and bob love leetcode", "i think so too", "this is great thanks very much"},
            new String[] {"please wait", "continue to fight", "continue to win"},
            new String[] {"please wait", "continue to fight", "continue to win", "alice and bob love leetcode", "i think so too", "this is great thanks very much"}


    );

    static List<Boolean> testCasesOutput = Arrays.asList(
            true, false, false,true,true
    );

    @Test
    public void shouldExecuteAllValidCombinations() {
        for (int i = 0; i < testCaseInputs.size(); i++) {
            MaxNumofWordsFoundinSentences solution = new MaxNumofWordsFoundinSentences();
            //   Assert.assertEquals(String.format("test case %d failed", i), testCasesOutput.get(i),  solution.solve(testCaseInputs.get(i)[0],testCaseInputs.get(i)[1]));
            System.out.println(solution.solve(testCaseInputs.get(i)));
        }
    }
}