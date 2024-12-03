package Others.Learn;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZerosToOneSide {
    public static void main(String[] args) {
        int[] input = {1,0,4,5,0,2,1,8,0,0,3,1};
        ArrayList<Integer> inputNonZeros = new ArrayList<>();
        int countZero = 0;
        int countNonZero = 0;
        for(int index : input){
            if(index == 0){
                inputNonZeros.add(index);
                countZero++;
            }
        }
        for(int index : input){
            if(index != 0){
                inputNonZeros.add(index);

            }

        }
        System.out.println(inputNonZeros);
        }
    }

