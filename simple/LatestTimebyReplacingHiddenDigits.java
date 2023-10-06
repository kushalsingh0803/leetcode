package simple;

public class LatestTimebyReplacingHiddenDigits {

    class Solution {
        public String maximumTime(String time) {
            char[] ch=time.toCharArray();


                if(ch[0] == '?'){
                    if (ch[1]=='?') {
                        ch[0]='2';
                        ch[1]='3';
                    } else {
                        ch[0] = ch[1]>'3'?'1':'2';

                    }
                }
              if(ch[1] == '?'){
                ch[1] =ch[0]>'1'?'3':'9';
            }
            if(ch[3] == '?'){
                ch[3] ='5';
            }
            if(ch[4] == '?'){
                ch[4] ='9';
            }
           return String.valueOf(ch);
        }
    }
}
