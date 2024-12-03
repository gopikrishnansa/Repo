package Others.Learn;
import java.util.*;

import java.util.Arrays;

public class FindTheLargest {
    public static void main(String[] args){
        char[] input = {'a','b','c','a','s'};

        List<Character> list = new ArrayList<>();

        LinkedHashMap<Character,Integer> indexMain =  new LinkedHashMap<>();
        for(char index : input){
            char indexCount = ' ';
            int count = 0;
            for(char index2 : input){
                if(index == index2){
                    count++;
                    indexCount= index;
                }
            }
            indexMain.put(indexCount,count);
        }
        System.out.println(indexMain);
        for(Map.Entry<Character, Integer> index : indexMain.entrySet()){
            if(index.getValue() == 2){
                System.out.println(index.getKey());
            }

        }

    }
}
