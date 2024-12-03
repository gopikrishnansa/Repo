package Others.Learn;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.*;

public class FirstDuplicate {
    public static void main(String[] args) {
        ArrayList<Character> characters = new ArrayList<>();
        characters.add('e');
        characters.add('w');
        characters.add('e');
        characters.add('r');
        characters.add('w');
        LinkedHashSet<Character> nonRepeating = new LinkedHashSet<>();
        for(char character : characters){
            if(nonRepeating.contains(character)){
                System.out.println("duplicate is found and first duplicate is "+ character);
                break;
            }
            else {
                nonRepeating.add(character);

            }
            //System.out.println(character);
        }

    }
}
