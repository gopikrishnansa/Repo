package Others.StringReversal;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class ReverseNumber {
    @Test
    public void reversal() {
        int input = 1234;
        int temp = input;
        int reversed = 0;
        while (temp != 0) {
            int lastdigit = temp % 10;
            reversed = reversed * 10 + lastdigit;
            temp = temp / 10;
        }
        System.out.println(reversed);
    }

    @Test
    public void findDuplicates() {
        String name = "pgoppiiiiii";
        char[] namech = name.toCharArray();
        HashSet<Character> seen = new HashSet<>();
        HashSet<Character> duplicates = new HashSet<>();
        HashSet<Integer> counts = new HashSet<>();

        for(char c : namech){
            if(seen.contains(c)){
                int count = 0;
                if(!duplicates.contains(c)){
                    duplicates.add(c);
                    count ++;
                }
                counts.add(count);
            }
            else{
                seen.add(c);
            }
        }
        System.out.println(duplicates);
        System.out.println(counts);
    }
}