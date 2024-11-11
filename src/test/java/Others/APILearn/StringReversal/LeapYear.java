package Others.APILearn.StringReversal;
import org.testng.annotations.Test;
public class LeapYear {
    public static void main(String[] Args){
        int inputYear = 2024;
        boolean leapYear = inputYear%4==0 && (inputYear%400 == 0 || inputYear%100 != 0);
        if (leapYear== true){
            System.out.println("Leap year ");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
