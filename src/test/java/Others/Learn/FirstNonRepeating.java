package Others.Learn;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static void main(String[] args){
        String input = "session";
        LinkedHashMap<Character,Integer> index = new LinkedHashMap<>();
        for(int i= 0; i < input.length(); i++){
            char character = input.charAt(i);
            int count = 0;
            for(int j = 0; j < input.length(); j++){
                if(input.charAt(j)==character){
                    count++;
                }

            }
            index.put(character,count);

        }
        System.out.println(index);
        for(Map.Entry<Character,Integer> entry : index.entrySet()){
            if(entry.getValue() == 1){
                System.out.println("first non repeating character is : " + entry.getKey());
                break;
            }
        }

    }

}
