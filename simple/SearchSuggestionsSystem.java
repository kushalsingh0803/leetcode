package simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchSuggestionsSystem {

    class Solution {
        public List<List<String>> suggestedProducts(String[] products, String searchWord) {
            List<List<String>> result = new ArrayList();
            Arrays.sort(products);
            String searchChar="";
            for(int i=0;i<searchWord.length();++i){
                List<String> searchResult = new ArrayList();
                searchChar += searchWord.charAt(i);
                for(int j=0;j<products.length;++j){
                    if(products[j].startsWith(searchChar)){
                        searchResult.add(products[j]);
                        if(searchResult.size()==3)
                            break;
                    }
                }
                result.add(searchResult);
            }
            return result;
        }
    }
}
