package Others.Leetcode;

public class CountOfLastSentence {
    public static void main(String[] args) {
        String input = "Hello World";
        input = input.trim();
        int indexOfLastSpace = input.lastIndexOf(' ');
        int totalLengthOfString = input.length();
        int charaLength = totalLengthOfString - indexOfLastSpace;
        System.out.println(charaLength-1);


    }
}
