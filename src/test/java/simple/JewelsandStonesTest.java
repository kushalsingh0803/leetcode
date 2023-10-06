package simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class JewelsandStonesTest {

    static List<String[]> testCaseInputs = Arrays.asList(
            new String[] {"aA","aAAbbbb"},
            new String[] {"z","ZZ"},
            new String[] {"dfvT","Tdfrghdfvvhb"}

    );
    static List<String[]> testCaseInputs2 = Arrays.asList(
            new String[] {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"},
            new String[] {"Piatti","Burger King","Hungry Hunter Steakhouse","Shogun"},
            new String[] {"KFC","Shogun","Burger King"}

    );

    static List<Boolean> testCasesOutput = Arrays.asList(
            false, false, false,true,true
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            JewelsandStones solution = new JewelsandStones();
            //  Assert.assertEquals(String.format("test case %d failed", i), testCasesOutput.get(i),  solution.solve(testCaseInputs.get(i)[0],testCaseInputs.get(i)[1]));
            System.out.println(solution.solve(testCaseInputs.get(i)[0],testCaseInputs.get(i)[1]));
        }
    }
}