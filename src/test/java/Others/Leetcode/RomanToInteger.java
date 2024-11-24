package Others.Leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String input = "MCMXCIV";
        HashMap<Character, Integer> romanToInteger = new HashMap<>();


        romanToInteger.put('I', 1);
        romanToInteger.put('V', 5);
        romanToInteger.put('X', 10);
        romanToInteger.put('L', 50);
        romanToInteger.put('C', 100);
        romanToInteger.put('D', 500);
        romanToInteger.put('M', 1000);

        System.out.println(romanToInteger);
        char previousCharacter = input.charAt(input.length()-1);
        int result = romanToInteger.get(input.charAt(input.length()-1));

        for(int i = input.length()-2; i >= 0; i--){
            char currentCharacter = input.charAt(i);

                if(romanToInteger.get(currentCharacter)< romanToInteger.get(previousCharacter)){
                    result = result - romanToInteger.get(currentCharacter);

                }
            else{
                result = result + romanToInteger.get(currentCharacter);

            }
            previousCharacter = currentCharacter;
        }
        System.out.println(result);

    }
}
