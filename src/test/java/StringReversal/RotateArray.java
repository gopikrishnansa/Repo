package StringReversal;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class RotateArray {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> reverse = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        for(int i = nums.size()-1; i>=0 ; i--){
            //System.out.println(nums.get(i));
            reverse.add(nums.get(i));


        }
        System.out.println(reverse);

    }
}
