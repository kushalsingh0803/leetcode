package simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyboardRow {

    public String[] solve(String[] words) {
        KeyboardRow.Solution solution = new KeyboardRow.Solution();
        return solution.findWords(words);
    }



    class Solution {
        char[] keyBoardFirstRow = {'q','w','e','r','t','y','u','i','o','p', 'Q', 'W', 'E', 'R','T','Y','U','I','O','P'};
        char[] keyBoardSecondRow = {'a','s','d','f','g','h','j','k','l','A', 'S', 'D', 'F', 'G','H','J','K','L'};
        char[] keyBoardThirdRow = {'z','x','c','v','b','n','m','Z','X','C', 'V', 'B', 'N', 'M'};

        public String[] findWords(String[] words) {

            List<String> res = new ArrayList<>();
            for (int i = 0; i < words.length; i++) {

                if (new String(keyBoardFirstRow).indexOf(words[i].charAt(0)) != -1){

                    if(isAllCharFromSameRow(words[i],keyBoardFirstRow)){

                        res.add(words[i]);
                    }


                }
                else if (new String(keyBoardSecondRow).indexOf(words[i].charAt(0)) != -1){

                    if(isAllCharFromSameRow(words[i],keyBoardSecondRow)){

                        res.add(words[i]);
                    }



                }else {

                    if(isAllCharFromSameRow(words[i],keyBoardThirdRow)){

                        res.add(words[i]);
                    }

                }


            }

            String op[] = new String[res.size()];
            for (int i = 0; i < res.size(); i++) {
                op[i] = res.get(i);
            }

            return op;
        }



        public boolean isAllCharFromSameRow(String word, char[] keyBoardRow)
        {
            for (int i =0;i<word.length();i++){

                if (new String(keyBoardRow).indexOf(word.charAt(i)) == -1){
                    return false;
                }

            }
            return true;
        }
    }
}
