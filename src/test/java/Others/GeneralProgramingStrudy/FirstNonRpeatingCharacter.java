package Others.GeneralProgramingStrudy;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRpeatingCharacter {
    public static void main(String[] args){
        String input = "equivalent";
        LinkedHashMap<Character, Integer> index = new LinkedHashMap<>();
        for(int i = 0; i < input.length(); i++){
            int count = 0;
            Character character = null;
            for(int j = 0; j < input.length(); j++){
                if(input.charAt(i)==input.charAt(j)){
                    count++;
                    character = input.charAt(i);
                }

            }
            index.put(character,count);

        }
        //System.out.println(index);
        for(Map.Entry<Character,Integer> entry : index.entrySet()){
            if(entry.getValue()== 1){
                System.out.println("First non-repeating character is : "+entry.getKey());
                break;
            }

        }
    }
}