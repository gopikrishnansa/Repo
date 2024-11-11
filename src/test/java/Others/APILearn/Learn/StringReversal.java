package Others.APILearn.Learn;

public class StringReversal {
    public static void main(String [] Args){

        String input = "gopi";
        String output ="";
        System.out.println(input.length());
        for(int i = input.length()-1; i>=0; i--){
            System.out.println(i);
            char character = input.charAt(i);
            output = output + character;

        }
        System.out.println(output);
    }

}
