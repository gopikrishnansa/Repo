package Others.GeneralProgramingStrudy;
import java.util.Scanner;

public class PrimeNumber {
    public static class PrimeTest {
        public static void prime() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number : ");

            try {
                int input = scanner.nextInt();
                boolean isPrime = true;
                if (input == 0 || input == 1) {
                    isPrime = false;
                } else {
                    for (int i = 2; i <= Math.sqrt(input); i++) {
                        if (input % i == 0) {
                            isPrime = false;
                            break;
                        }

                    }
                }

                if (isPrime) {
                    System.out.println("is prime");
                } else {
                    System.out.println("Not a prime");
                }

            } catch (Exception e) {
                System.out.println("Please enter a valid number  ");
            }
            //int input = 3;

        }
    }
    public static void main(String[] args) {
        try{
            PrimeTest.prime();
        }
        catch (Exception e){
            System.out.println("enter correct number : ");
            PrimeTest.prime();
        }

    }
}


