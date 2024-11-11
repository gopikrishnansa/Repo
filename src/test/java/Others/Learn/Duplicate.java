package Others.Learn;
import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        String input = "goppppppppppppppppppppppppppppiiiiii";
        LinkedHashMap<Character,Integer> name = new LinkedHashMap<>();

        for(int i = 0; i < input.length(); i++){
            int count = 0;
            for(int j=0; j<input.length();j++){
                if(input.charAt(i)==input.charAt(j)){
                    count++;
                    name.put(input.charAt(i),count);
                }
            }


        }
        System.out.println(name);
    }
}
