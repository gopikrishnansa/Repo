package Others.StringReversal;

import java.util.Arrays;

public class SortBubble {
    public static void main(String[] args) {
        int[] inputArray = {1,3,5,2,4};
        for(int i = 0; i<inputArray.length; i++){
            for(int j = 0; j<inputArray.length-1; j++){
                if(inputArray[j]>inputArray[j+1]){
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j+1];
                    inputArray[j+1]= temp;
                }
            }

        }
        System.out.println(Arrays.toString(inputArray));
    }
}
