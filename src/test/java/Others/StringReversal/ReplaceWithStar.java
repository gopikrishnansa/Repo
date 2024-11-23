package Others.StringReversal;

public class ReplaceWithStar {
    public static void main(String[] args) {
        String input2 = "This is a string input";
        String input = input2.toLowerCase();
        String output = "";
        for(int i = 0; i<input.length(); i++){
            //System.out.println(input.charAt(i));
            if(input.charAt(i) == 'a' ||input.charAt(i) == 'e' ||input.charAt(i) == 'i' ||input.charAt(i) == 'o' ||input.charAt(i) == 'u' ){
                output = output + '*';
            }
            else {
                output = output + input.charAt(i);
            }
        }
        System.out.println(output);

    }


}
