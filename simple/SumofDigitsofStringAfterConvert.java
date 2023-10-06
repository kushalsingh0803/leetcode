package simple;

public class SumofDigitsofStringAfterConvert {


    public static void main(String[] args)
    {
        SumofDigitsofStringAfterConvert.Solution solution = new SumofDigitsofStringAfterConvert.Solution();
        System.out.println(solution.getLucky("fleyctuuajsr" ,5));

    }

    static class Solution {
        public int getLucky(String s, int k) {
        String number ="";

        for ( char ch :s.toCharArray()){

            number = number + (ch-'a'+1);
        }
        int i =1;
           while (i<=k)
            {
                int sum = 0;
                for(int j=0; j<number.length(); j++)
                {
                    sum += number.charAt(j) - '0';
                }
                number = String.valueOf(sum);
                i++;
            }
            return Integer.parseInt(number);
        }

        }
    }

