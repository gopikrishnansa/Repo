package Others.Learn;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.*;
public class Sort {
    @Test
    public void sortUsingCollection() {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(3);
        input.add(2);
        input.add(7);
        input.add(5);
        System.out.println(input);
        for(int i = 0; i< input.size(); i++){
           // System.out.println(input.get(i));
            for(int j = 0; j< input.size()-i-1; j++){
                if(input.get(j)>input.get(j+1)){
                    Collections.swap(input,j,j+1);
                }

            }

        }
        System.out.println(input);
    }

    @Test
    public void sortArray(){
        int[] input = {1,2,3,5,4};
        for (int i = 0; i < input.length; i++){
            //System.out.println("i = "+ input[i]);
            for(int j = 0; j <input.length-1; j++){
                //System.out.println("j = "+ input[j]);
                if(input[j]>input[j+1]){
                    int temp = input[j] ;
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }


        }
        System.out.println(Arrays.toString(input));

    }














}
