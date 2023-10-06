package simple;

public class DetectCapital {

    public boolean solve(String s) {
        DetectCapital.Solution solution = new DetectCapital.Solution();
        return solution.detectCapitalUse(s);
    }


    class Solution {
        public boolean detectCapitalUse(String word) {
            boolean firstCharCapital = false;
            boolean otherCharCapital = false;
            boolean allCharSmall = true;
            int capitalCount = 0;
          for ( int i = 0; i < word.length(); i++){
             if (Character.isUpperCase(word.charAt(i))){
                 allCharSmall = false;
                  if (i ==0){
                      firstCharCapital = true;
                      capitalCount++;
                  }
                  else {
                      otherCharCapital = true;
                      capitalCount++;
                  }

             } else if ( firstCharCapital && otherCharCapital && Character.isLowerCase(word.charAt(i))) {
                System.out.println("TEST");
                 return  false;

             }


          }


          if (allCharSmall){

              return  true;
          }
          else if ( firstCharCapital && ! otherCharCapital ){

              return true;
          } else if ( capitalCount == word.length()){

              return  true;
          }else  {

              return false;
          }


        }


    }
}
