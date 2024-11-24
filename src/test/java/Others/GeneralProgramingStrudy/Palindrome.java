package Others.GeneralProgramingStrudy;

public class Palindrome {
    public static void main(String[] Args){
        int input = 0;
        int temp = input;
        int reverse = 0;
        while(temp!= 0){
            int lastNumber = temp%10;
            reverse = reverse*10 + lastNumber;
            temp = temp / 10 ;

        }

        System.out.println(reverse);
        if(input == reverse){
            System.out.println("palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }

}
