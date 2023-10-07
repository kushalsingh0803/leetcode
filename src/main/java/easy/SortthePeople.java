package easy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class SortthePeople {


    public static void main(String[] args) throws IOException {

        String[]  names=new String[] {"Mary","John","Emma"};
        int[] heights=new int[] {180,165,170};
        String[]  result = SortthePeople.sortPeople(names, heights);
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
    }


    public static String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> personMap = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            personMap.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        String[] res = new String[heights.length];
        int j = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            res[j] = personMap.get(heights[i]);
            j++;
        }
        return res;
    }
}
