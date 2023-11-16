package easy;

public class GreatestCommonDivisorStrings {

    public String gcdOfStrings(String str1, String str2) {
        if (!(str1+str2).equals(str2+str1)){
            return "";
        }

        int str1Len = str1.length();
        int str2Len = str2.length();

        while (str1Len != 0){
            str1Len = str1Len % str2Len;
            str2Len = str2Len - str1Len;
        }

        return str1.substring(0, str2Len);
    }
}
