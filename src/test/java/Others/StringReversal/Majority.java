package Others.StringReversal;

import java.util.ArrayList;
import java.util.*;

public class Majority {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        LinkedHashMap<Integer,Integer> index = new LinkedHashMap<>();
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(1);
        nums.add(3);
        nums.add(3);
        nums.add(3);
        nums.add(1);
        nums.add(1);

        for(int num : nums){
            int count = 0;
            for(int num2 : nums){

                if(num == num2)
                    count++;
                //System.out.println(num);
            }
            //System.out.println("count" + count);
            index.put(num,count);
        }
        System.out.println(index);
        for(Map.Entry<Integer,Integer> iterate : index.entrySet()){
            //System.out.println("Keys : " + iterate.getKey());
            //System.out.println("Values : " + iterate.getValue());
            if(iterate.getValue()>2){
                System.out.println("Major element is " + iterate.getKey() + " and occurance is " + iterate.getValue());
            }
        }


    }


}
