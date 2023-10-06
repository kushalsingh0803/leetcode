package simple;

public class ReformatPhoneNumber {


    public static void main(String[] args)
    {
        ReformatPhoneNumber.Solution solution = new ReformatPhoneNumber.Solution();
        System.out.println(solution.reformatNumber("123 4-567"));

    }

    static class Solution {
        public String reformatNumber(String number) {

            String phNo =  number.replaceAll("[^0-9]", "");;


            String result = "";
           int l = phNo.length();
           int i =0;

            while (l>4){

                     result = result + (phNo.substring(i,i+3)) +("-");

                    i=i+3;
                    l=l-3;
                 }

               if(l==4){
                    result = result + (phNo.substring(i,i+2)) + "-" +phNo.substring(i+2);

                }
               else if(l==3){
                    result = result + (phNo.substring(i,i+3));

                }
                else if(l==2){
                    result = result + (phNo.substring(i,i+2));

                }


            return result;
        }
    }
}
