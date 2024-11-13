package Others.Learn;

public class palindrome {
    public static void main(String[] Args){
        int input = 1234;
        int temp = input;
        int reverse = 0;
        while(temp!=0){
            int lastDigit = temp%10;
            reverse = reverse*10 + lastDigit;
            temp = temp/10;

        }
        System.out.println(reverse);
    }
}
