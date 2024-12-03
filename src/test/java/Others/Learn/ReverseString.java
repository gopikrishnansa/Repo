package Others.Learn;

import org.openqa.selenium.devtools.v128.input.Input;

public class ReverseString {
    public static void main(String[] args) {
        int input = 1234;
        int temp = input;
        int reversed = 0;
        while(temp!=0){
            int lastDigit = temp % 10;
            reversed = reversed * 10 + lastDigit;
            temp = temp/10;
        }
        System.out.println(reversed);
    }



}
