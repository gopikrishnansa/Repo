package Learn;
import java.util.*;
public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(3);
        input.add(2);
        input.add(7);
        input.add(5);
        System.out.println(input);
        TreeSet<Integer> sorted = new TreeSet<>(input);
        System.out.println("Sorted list: "+sorted);
    }
}
