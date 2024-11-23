        package Others.GeneralProgramingStrudy;

        import java.sql.SQLOutput;
        import java.util.Scanner;

        public class RomanToInteger {
            public static void main(String[] args) {
                int value = 0;
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();
                for(int i = 0; i < input.length(); i++){
                    if(input.charAt(i)=='I'){
                        value = value + 1;
                    }
                    if(input.charAt(i)=='V'){
                        value = value + 5;
                    }
                    if(input.charAt(i)=='X'){
                        value = value + 10;
                    }
                    if(input.charAt(i)=='L'){
                        value = value + 50;
                    }
                    if(input.charAt(i)=='C'){
                        value = value + 100;
                    }
                    if(input.charAt(i)=='D'){
                        value = value + 500;
                    }
                    if(input.charAt(i)=='M'){
                        value = value + 1000;
                    }
                }
                System.out.println(value);
            }

        }
