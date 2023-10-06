package simple;

public class RearrangeSpacesBetweenWords {


    public static void main(String[] args)
    {
        RearrangeSpacesBetweenWords.Solution solution = new RearrangeSpacesBetweenWords.Solution();
        System.out.println(solution.reorderSpaces("  this   is  a sentence "));

    }

    static class Solution {
        public String reorderSpaces(String text) {
            StringBuilder sb = new StringBuilder();
            int space=0;

            for(int i=0; i<text.length(); i++){
                char ch=text.charAt(i);
                if(ch==' '){
                    space++;
                }
            }
            String[] wordlist = text.trim().replaceAll("\\s+", " ").split("\\s+");

            int equalSpace = wordlist.length ==1 ? space: space/(wordlist.length-1);
            System.out.println(equalSpace);
            int i = 0;
            for (String word :wordlist){
                sb.append(word);

                for(int count =0; i<space && count<equalSpace;count++){
                    sb.append(" ");
                    i++;
                }

            }
            System.out.println(i);
            System.out.println(space);
            while(i<space){
                sb.append(" ");
                i++;
            }

            return sb.toString();
        }
    }
}
