package simple;

import java.util.HashSet;
import java.util.Set;

public class PathCrossing {

    public static void main(String[] args)
    {
        PathCrossing.Solution solution = new PathCrossing.Solution();
        System.out.println(solution.isPathCrossing("NNSWWEWSSESSWENNW"));

    }

    static class Solution {
        public boolean isPathCrossing(String path) {
            Set<String> visited = new HashSet<>();
            int x = 0; int y =0;
            visited.add(x+"-"+y);
            for ( char c:path.toCharArray()){
                if ( c=='N') y++;
                if ( c=='S') y--;
                if ( c=='W') x--;
                if ( c=='E') x++;
                if (visited.contains(x+"-"+y)) return true;
                visited.add(x+"-"+y);
            }


            return  false;
        }
    }
}
