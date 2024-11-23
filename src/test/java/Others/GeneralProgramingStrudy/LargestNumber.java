package Others.GeneralProgramingStrudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LargestNumber {
    public static void main(String[] args) {
    int[] numbers = {1,3,2,7,5,6};
    for(int i = 0; i < numbers.length-1; i++){
        for(int j = 0; j < numbers.length-1; j++){

        if(numbers[j]>numbers[j+1]){
            int temp = numbers[j];
            numbers[j] = numbers[j+1];
            numbers[j+1] = temp;
        }
        }
    }
        System.out.println(Arrays.toString(numbers));

    }
}
