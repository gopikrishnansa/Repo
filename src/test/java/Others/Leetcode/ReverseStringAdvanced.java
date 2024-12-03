package Others.Leetcode;

import java.util.Arrays;

public class ReverseStringAdvanced {
    public static void main(String[] args) {
        String input = "the sky is blue";
        String output = "";
        input = input.trim();
        String[] words = input.split(" ");
        for(int i = words.length - 1 ; i >= 0; i--){

            output = output + " "+ words[i] ;
            output = output.trim();


        }
        System.out.println(output);

    }
}
