package simple;

public class SecondLargestDigitinaString {

    class Solution {
        public int secondHighest(String s) {
            int[] number = new int[10];

            for(char ch : s.toCharArray()) {
                if(ch >= '0' && ch <= '9')
                    number[ch-'0']++;
            }

            boolean maxfound = false;
            for (int i =number.length -1 ;i>=0;i--){
                if(number[i] > 0){
                    if(maxfound){
                        return i;
                    }else maxfound = true;



                }
            }

            return -1;
        }
    }
}
