package Others.Learn;

import groovyjarjarantlr4.runtime.tree.Tree;

import javax.xml.transform.Source;
import java.util.TreeSet;

public class LargestInAnArray {
    public static void main(String[] args) {
        int input = 1234;
        int temp = input;
        int reversed = 0;
        while(temp !=0){
            int lastValue = temp%10;
            reversed = reversed * 10 + lastValue;
            temp = temp/10;
        }
        System.out.println(reversed);

    }
}
