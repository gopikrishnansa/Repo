package Others.Learn;

import java.util.Arrays;

public class ZerosAndOnes {
    public static void main(String[] args) {
        int[] input = {1,0,1,1,0,0,1};
        int indexPosition = 0;
        for(int value : input){
            if(value == 1){
                input[indexPosition] = 1;
                indexPosition++;
            }
        }
        for(int i = indexPosition; i <input.length; i++){
            input[i] = 0;
        }
        System.out.println(Arrays.toString(input));
    }
}
