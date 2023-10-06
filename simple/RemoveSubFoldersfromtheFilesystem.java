package simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSubFoldersfromtheFilesystem {

    class Solution {
        public List<String> removeSubfolders(String[] folder) {
            List<String> result = new ArrayList<>();
            Arrays.sort(folder);
            String mainFolder = folder[0]+"/";
            result.add(folder[0]);
            for(int i=1;i<folder.length;i++)
            {
                if(!folder[i].startsWith(mainFolder))
                {
                    result.add(folder[i]);
                    mainFolder = folder[i]+"/";
                }
            }

            return result;
        }
    }
}
