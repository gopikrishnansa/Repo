package Others.StringReversal;

public class ReplaceVowelsWithStar {
    public static void main(String[] args) {
        String input = "gopikrishnan";
        String output ="";
        for(int i =0; i< input.length();i++){
            if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u'){
                output+="*";

            }
            else{
                output+=input.charAt(i);
            }
        }
        System.out.println(output);

    }

}
