package Others.Stock;

public class StockPractiseOne {
    public static void main(String[] args) {
        int[] input = {1,4,6,3,2};
        int minprice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < input.length; i++){
            if(input[i]<minprice){
                minprice = input[i];
            }
            int profit = input[i] - minprice;
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
        System.out.println(maxProfit);
    }
}
