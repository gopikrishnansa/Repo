package Others.Learn;
import java.util.*;

public class SortingManual {
    public static void main(String[] Args){
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(3);
        input.add(2);
        input.add(7);
        input.add(5);
        Collections.sort(input);
        System.out.println(input);
        for(int i = 0; i<=input.size()-1; i++){
            for(int j=0; j<input.size()-i-1; j++ ){
                if(input.get(j)>input.get(j+1)){
                    Collections.swap(input,j, j+1);
                }

            }
        }
        System.out.println(input);


    }

}
