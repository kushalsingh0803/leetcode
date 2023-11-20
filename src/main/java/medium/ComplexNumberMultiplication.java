package medium;

public class ComplexNumberMultiplication {
    public String complexNumberMultiply(String num1, String num2) {

        int x =  (Integer.parseInt(num1.substring(0,num1.indexOf('+')))*Integer.parseInt(num2.substring(0,num2.indexOf('+')))) - (Integer.parseInt(num1.substring(num1.indexOf('+')+1, num1.length()-1))*Integer.parseInt(num2.substring(num2.indexOf('+')+1, num2.length()-1)));
        int y =  (Integer.parseInt(num1.substring(0,num1.indexOf('+')))*Integer.parseInt(num2.substring(num2.indexOf('+')+1, num2.length()-1))) + (Integer.parseInt(num2.substring(0,num2.indexOf('+')))*Integer.parseInt(num1.substring(num1.indexOf('+')+1, num1.length()-1)));
        return x+"+"+y+"i";
    }
}
