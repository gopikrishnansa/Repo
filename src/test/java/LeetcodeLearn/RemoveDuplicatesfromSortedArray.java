package LeetcodeLearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 4, 4, 4};

        // Create a TreeSet to automatically handle duplicate removal
        TreeSet<Integer> sorted = new TreeSet<>();

        // Add elements from the array to the TreeSet
        for (int i = 0; i < nums.length; i++) {
            sorted.add(nums[i]);
        }

        // Convert TreeSet back to ArrayList
        ArrayList<Integer> list = new ArrayList<>(sorted);

        // Copy unique elements back into the original array
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        // The length of the unique elements
        int n = list.size();
        System.out.println("Number of unique elements: " + n);

        // Optional: Printing the unique elements
        System.out.print("Unique elements: ");

            System.out.print(Arrays.toString(nums));

    }
}
